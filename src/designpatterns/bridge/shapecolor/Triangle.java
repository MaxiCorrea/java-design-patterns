package designpatterns.bridge.shapecolor;

public class Triangle extends Shape {

  public Triangle(Color color) {
    super(color);
  }

  @Override
  public void applyColor() {
    getColor().apply();
  }

}
