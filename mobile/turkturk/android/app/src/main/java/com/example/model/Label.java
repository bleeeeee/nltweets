

package com.example.model;

public class Label {

  private String labelName;
  private String labelDescription;
  private int labelID;

  public Label(String labelName, String labelDescription, int labelID) {
    this.labelName = labelName;
    this.labelDescription = labelDescription;
    this.labelID = labelID;
  }

  public String getLabelName() { return labelName; }

  public String getLabelDescription() { return labelDescription; }

  public int getLabelID() { return labelID; }
}
