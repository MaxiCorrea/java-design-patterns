package designpatterns.decorator.starbuzz;

public class Decaf extends Beverage {

  public Decaf() {
    super("Decaf Coffee");
  }
  
  @Override
  public double cost() {
    return 1.05;
  }

}
