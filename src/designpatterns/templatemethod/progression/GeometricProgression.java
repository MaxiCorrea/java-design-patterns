package designpatterns.templatemethod.progression;

public class GeometricProgression extends AbstractProgression {

  private final int base;

  public GeometricProgression(int start , int base) {
    super(start);
    this.base = base;
  }

  @Override
  int advance() {
    return getCurrentValue() * base;
  }

}
