package designpatterns.adapter.dialler;

import java.util.ArrayList;
import java.util.List;

public class Dialler {

  private List<Integer> digitsList;

  public Dialler() {
    digitsList = new ArrayList<>();
  }

  public void pressDigit(int digit) {
    digitsList.add(digit);
  }

  public boolean containsDigit(int digit) {
    return digitsList.contains(digit);
  }

  public boolean isEmpty() {
    return digitsList.isEmpty();
  }

}
