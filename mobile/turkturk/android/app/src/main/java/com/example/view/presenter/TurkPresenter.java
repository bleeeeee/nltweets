package com.example.view.presenter;

import com.example.model.Callback;
import com.example.model.DataSample;
import com.example.model.Label;
import com.example.model.Labels;

import java.util.List;

public class TurkPresenter implements Presenter, Callback {
  private View view;
  private Labels labels;

  @Override public void onResume() {
  }

  @Override public void onItemSelected(Label label, int position) {
  }

  @Override public void onLoadLabels(List<Label> labels) {
  }

  public interface View {

    void showProgress();

    void hideProgress();

    void showLabels(List<Label> labels);

    void showMessage(String message);
  }
}
