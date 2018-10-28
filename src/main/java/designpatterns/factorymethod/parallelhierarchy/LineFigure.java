package designpatterns.factorymethod.parallelhierarchy;

public class LineFigure extends AbstractFigure {

  @Override
  AbstractManipulator createManipulator() {
    return new LineManipulator();
  }

}
