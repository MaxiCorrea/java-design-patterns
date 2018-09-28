package designpatterns.decorator.starbuzz;

public abstract class Beverage {

  private final static String UNKNOWN = "Unknown Beverage";
  
  private final String description;
  
  public Beverage() {
    this(UNKNOWN);
  }
  
  public Beverage(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
  
  public abstract double cost();
  
}
