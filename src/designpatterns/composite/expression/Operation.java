package designpatterns.composite.expression;

import static java.lang.String.format;

public abstract class Operation extends Expression {

  private final Expression expression1;
  private final Expression expression2;

  public Operation(Expression expression1, Expression expression2) {
    this.expression1 = expression1;
    this.expression2 = expression2;
  }

  public Expression getExpression1() {
    return expression1;
  }

  public Expression getExpression2() {
    return expression2;
  }

  public abstract String operationString();

  @Override
  public String toString() {
    return format("(%s%s%s)", expression1, operationString(), expression2);
  }

}
