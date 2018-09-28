package designpatterns.decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage {

  private final Beverage decorated;
  
  public CondimentDecorator(Beverage decorated) {
    this.decorated = decorated;
  }
  
  public Beverage getDecorated() {
    return decorated;
  }
}
