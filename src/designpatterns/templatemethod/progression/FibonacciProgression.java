package designpatterns.templatemethod.progression;

public class FibonacciProgression extends AbstractProgression {

  private int prev;

  public FibonacciProgression() {
    prev = 1;
  }

  @Override
  int advance() {
    int tmp = prev;
    prev = getCurrentValue();
    return getCurrentValue() + tmp;
  }

}
