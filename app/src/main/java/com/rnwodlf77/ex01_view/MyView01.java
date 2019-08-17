package com.rnwodlf77.ex01_view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

//액티비티(화면)으로 만들기 위해서는 Activity 상속 받고, AndroidMainfest.xml에 등록 해야한다.
public class MyView01 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myview01);
    }
}
