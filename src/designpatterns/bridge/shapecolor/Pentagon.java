package designpatterns.bridge.shapecolor;

public class Pentagon extends Shape {

  public Pentagon(Color color) {
    super(color);
  }

  @Override
  public void applyColor() {
    getColor().apply();
  }

}
