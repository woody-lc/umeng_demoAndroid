package com.huichang.demo1;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.BindView;
public class MainActivity extends BaseActivity {
    @BindView(R.id.main_tv)TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int getContentViewResId() {
        return R.layout.activity_main;
    }
    @Override
    public void init(Bundle savedInstanceState) {
        textView.setText(MyApplication.device);
    }
}
