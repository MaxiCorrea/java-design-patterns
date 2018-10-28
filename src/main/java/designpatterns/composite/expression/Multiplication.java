package designpatterns.composite.expression;

public class Multiplication extends Operation {

  public Multiplication(Expression expression1, Expression expression2) {
    super(expression1, expression2);
  }

  @Override
  public String operationString() {
    return "*";
  }

  @Override
  public int operate() {
    return getExpression1().operate() * getExpression2().operate();
  }

}
