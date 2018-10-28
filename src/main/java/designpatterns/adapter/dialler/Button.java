package designpatterns.adapter.dialler;

public class Button {

  private final ButtonListener listener;
  private final int digit;
  
  public Button(ButtonListener listener , int digit) {
    this.listener = listener;
    this.digit = digit;
  }
  
  public void press() {
    listener.buttonPressed(digit);
  }
  
}
