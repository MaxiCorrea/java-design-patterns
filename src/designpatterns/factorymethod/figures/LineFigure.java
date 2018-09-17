package designpatterns.factorymethod.figures;

public class LineFigure extends AbstractFigure {

  @Override
  AbstractManipulator createManipulator() {
    return new LineManipulator();
  }

}
