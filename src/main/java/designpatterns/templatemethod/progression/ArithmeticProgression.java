package designpatterns.templatemethod.progression;

public class ArithmeticProgression extends AbstractProgression {

  private final int increment;

  public ArithmeticProgression(int increment) {
    this.increment = increment;
  }

  @Override
  int advance() {
    return getCurrentValue() + increment;
  }

}
