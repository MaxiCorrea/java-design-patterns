package designpatterns.adapter.dialler;

public class ButtonDiallerAdapter implements ButtonListener {

  private final Dialler dialler;
  
  public ButtonDiallerAdapter(Dialler dialler) {
    this.dialler = dialler;
  }
  
  @Override
  public void buttonPressed(int digit) {
    dialler.pressDigit(digit);
  }

}
