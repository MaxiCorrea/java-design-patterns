package designpatterns.composite.expression;

import static java.lang.String.valueOf;

public class Number extends Expression {

  private int value;
  
  @Override
  public int operate() {
    return value;
  }
  
  @Override
  public String toString() {
    return valueOf(value);
  }
  
}
