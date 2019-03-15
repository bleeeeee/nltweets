

package com.example.model;

import android.os.Handler;

import java.util.ArrayList;
import java.util.List;

import com.example.turkturk.R;

public class Labels {

  public void getLabels(final Callback callback) {
    final int DELEAY_MILLIS = 2000;
    new Handler().postDelayed(new Runnable() {
      @Override
      public void run() {
        callback.onLoadLabels(createArrayList());
      }
    }, DELEAY_MILLIS);
  }

  private List<Label> createArrayList() {

    List<Label> labels = new ArrayList<>();

    labels.add(
        new Label("Food & Drink", "Desc", 0));


    return labels;
  }
}
