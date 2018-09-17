package designpatterns.factorymethod.figures;

public class TextFigure extends AbstractFigure {

  @Override
  AbstractManipulator createManipulator() {
    return new TextManipulator();
  }

}
