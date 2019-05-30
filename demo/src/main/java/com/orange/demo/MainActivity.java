package com.orange.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.facebook.yoga.android.YogaLayout;
import com.facebook.yoga.android.YogaViewLayoutFactory;

public class MainActivity extends AppCompatActivity {

  YogaLayout yogaLayout;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    LayoutInflater.from(this).setFactory(YogaViewLayoutFactory.getInstance());
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_main);



  }
}
