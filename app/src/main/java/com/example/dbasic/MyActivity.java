package com.example.dbasic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.dbasic.databinding.ActivityMyBinding;

public class MyActivity extends AppCompatActivity {

    private ActivityMyBinding activityMyBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       activityMyBinding = DataBindingUtil.setContentView(this,R.layout.activity_my);

       getSupportFragmentManager().beginTransaction().add(R.id.my_frame, new DataFragment()).commit();

    }
}