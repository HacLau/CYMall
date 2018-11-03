package com.lsl.cymall.activity;

import android.os.Bundle;


import com.lsl.cymall.R;
import com.lsl.cymall.base.BaseActivity;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class LookHistoryActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_look_history);
    }

    @Subscribe(threadMode = ThreadMode.POSTING)
    public void getMessage(String message){

    }
}
