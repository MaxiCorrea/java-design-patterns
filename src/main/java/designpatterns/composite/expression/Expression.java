package designpatterns.composite.expression;

import static java.lang.String.valueOf;

public abstract class Expression {

  public abstract int operate();
  
  @Override
  public String toString() {
    return valueOf(operate());
  }
  
}
