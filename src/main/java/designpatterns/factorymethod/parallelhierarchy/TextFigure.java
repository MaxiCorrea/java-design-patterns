package designpatterns.factorymethod.parallelhierarchy;

public class TextFigure extends AbstractFigure {

  @Override
  AbstractManipulator createManipulator() {
    return new TextManipulator();
  }

}
