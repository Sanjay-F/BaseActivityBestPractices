package com.example.sanjay.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends BaseActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public void setActionBar() {
        setActivityTitle("demo1");
        setRight("right", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "on Right Click", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void findView() {

        btn = ((Button) findViewById(R.id.btn2));
    }

    @Override
    public void initView() {
        btn.setText(R.string.next_demo);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(Main3Activity.makeIntent(mContext));
            }
        });
    }
}
