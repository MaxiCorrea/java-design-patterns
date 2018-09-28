package designpatterns.decorator.starbuzz;

public class Espresso extends Beverage {

  public Espresso() {
    super("Espresso");
  }
  
  @Override
  public double cost() {
    return 1.99;
  }

}
