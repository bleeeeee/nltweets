

package com.example.view.presenter;

import com.example.model.Label;

public interface Presenter {

  void onResume();

  void onItemSelected(Label label, int position);
}
