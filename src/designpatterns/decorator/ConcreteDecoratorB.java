package designpatterns.decorator;

public class ConcreteDecoratorB extends Decorator {

  public ConcreteDecoratorB(Component decorated) {
    super(decorated);
  }

  @Override
  public void operation() {
    System.out.println("oooooooooooooo");
    System.out.println(getDecorated());
    System.out.println("oooooooooooooo");
  }

}
