package designpatterns.decorator.starbuzz;

public class Expresso extends Beverage {

  public Expresso() {
    super("Espresso");
  }
  
  @Override
  public double cost() {
    return 1.99;
  }

}
