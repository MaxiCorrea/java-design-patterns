package designpatterns.decorator.starbuzz;

public class Soy extends CondimentDecorator {

  public Soy(Beverage decorated) {
    super(decorated);
  }

  @Override
  public String getDescription() {
    return getDecorated().getDescription() + ", Soy";
  }
  
  @Override
  public double cost() {
    return .15 + getDecorated().cost();
  }

}
