package com.faisal.visitingcard;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import com.faisal.visitingcard.base.BaseActivity;
import com.faisal.visitingcard.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {
    ActivityMainBinding mainBinding;
    @Override
    public int setLayoutId() {
        return R.layout.activity_main;
    }
    @Override
    public void startUI() {

    }
}