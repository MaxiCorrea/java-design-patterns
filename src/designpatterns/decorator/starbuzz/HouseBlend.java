package designpatterns.decorator.starbuzz;

public class HouseBlend extends Beverage {

  public HouseBlend() {
    super("House Blend Coffee");
  }
  
  @Override
  public double cost() {
    return .89;
  }

}
