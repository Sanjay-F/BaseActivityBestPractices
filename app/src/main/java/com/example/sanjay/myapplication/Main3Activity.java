package com.example.sanjay.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class Main3Activity extends BaseActivity {

    public static Intent makeIntent(Context context) {
        return new Intent(context, Main3Activity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    @Override
    public void setActionBar() {
        setActivityTitle("demo3");
        setMenu(R.menu.menu_main3, new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(mContext, item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    @Override
    public void findView() {

    }

    @Override
    public void initView() {

    }

}
