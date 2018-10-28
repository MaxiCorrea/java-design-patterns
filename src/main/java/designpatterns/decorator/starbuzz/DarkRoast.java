package designpatterns.decorator.starbuzz;

public class DarkRoast extends Beverage {

  public DarkRoast() {
    super("Dark Roast Coffee");
  }
  
  @Override
  public double cost() {
    return .99;
  }

}
