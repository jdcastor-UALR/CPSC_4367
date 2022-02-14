package com.ualr.firstapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.ualr.firstapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View rootView = mBinding.getRoot();
        setContentView(rootView);
    }

    public void showTextMessage(View view) {
        String tempStr = mBinding.userInputET.getText().toString();
        if(!tempStr.equals(""))
            mBinding.userMsgTV.setText(tempStr);
    }

    public void cleanTextField(View view) {
        mBinding.userMsgTV.setText("");
    }
}
