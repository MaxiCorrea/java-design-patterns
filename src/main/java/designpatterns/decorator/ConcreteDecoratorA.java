package designpatterns.decorator;

public class ConcreteDecoratorA extends Decorator {

  public ConcreteDecoratorA(Component decorated) {
    super(decorated);
  }

  @Override
  public void operation() {
    System.out.println("<------------>");
    getDecorated().operation();
    System.out.println("<------------>");
  }

}
