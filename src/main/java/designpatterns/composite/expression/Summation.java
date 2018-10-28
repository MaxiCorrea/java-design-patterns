package designpatterns.composite.expression;

public class Summation extends Operation {

  public Summation(Expression expression1, Expression expression2) {
    super(expression1, expression2);
  }

  @Override
  public String operationString() {
    return "+";
  }

  @Override
  public int operate() {
    return getExpression1().operate() + getExpression2().operate();
  }

}
