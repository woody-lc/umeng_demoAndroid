package com.huichang.demo1;

import android.app.Application;
import android.util.Log;

import com.umeng.message.IUmengRegisterCallback;
import com.umeng.message.PushAgent;

/**
 * Created by Administrator on 2018/1/9.
 */

public class MyApplication extends Application {
    public static String device="";
    @Override
    public void onCreate() {
        super.onCreate();
        PushAgent mPushAgent = PushAgent.getInstance(this);
        //注册推送服务，每次调用register方法都会回调该接口
        mPushAgent.register(new IUmengRegisterCallback() {

            @Override
            public void onSuccess(String deviceToken) {
                //注册成功会返回device token
                Log.i("deviceToken-------",deviceToken);
                device=deviceToken;
            }

            @Override
            public void onFailure(String s, String s1) {

            }
        });
        //完全自定义消息设置
        mPushAgent.setPushIntentServiceClass(MyPushIntentService.class);
        //PushSDK 日志关闭
        //mPushAgent.setDebugMode(false);

    }
}
