package designpatterns.factorymethod.parallelhierarchy;

public class Client {

  public static void main(String[] args) {
    AbstractFigure figure = new TextFigure();
    AbstractManipulator manipulator = figure.createManipulator();
    manipulator.downClick();
    manipulator.drag();
    manipulator.upClick();
  }
  
}
