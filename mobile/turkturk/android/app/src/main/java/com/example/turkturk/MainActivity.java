package com.example.turkturk;

import android.app.ActionBar;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.common.BaseActivity;
import com.example.turkturk.R;
import com.example.inject.component.AppComponent;

import com.example.common.LayoutHelper;

public class MainActivity extends BaseActivity {

  private View parentView;
  private View stackedView;
  private View sampleView;
  private View lablerView;

  private LayoutHelper layout;

  @Override protected void setupComponent(AppComponent appComponent) {

  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    setupToolbar();
  }

  @Override
  protected void onStart() {
    super.onStart();
  }

  @Override
  protected void onResume() {
    super.onResume();
  }

  @Override
  protected void onPause() {
    super.onPause();
  }

  private void setupToolbar() {

    Context context = getApplicationContext();


    Toolbar toolbar = findViewById(R.id.toolbar);

  }

}
