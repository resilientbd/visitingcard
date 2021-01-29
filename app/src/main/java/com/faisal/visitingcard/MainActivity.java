package com.faisal.visitingcard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.AndroidViewModel;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
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
        mainBinding=(ActivityMainBinding)getViewDataBinding();
        goToDialPad();


    }

    private void goToDialPad() {
        mainBinding.textViewNumber.setOnClickListener(View->{
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+mainBinding.textViewNumber.getText().toString().trim()));
            startActivity(callIntent);
        });
    }
}