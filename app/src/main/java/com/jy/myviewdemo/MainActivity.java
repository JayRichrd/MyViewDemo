package com.jy.myviewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 响应点击按钮“自定义View一”
     *
     * @param view 被点击的按钮
     */
    public void myView1(View view) {
        intent = new Intent(this, CircleViewActivity.class);
        startActivity(intent);
    }
}
