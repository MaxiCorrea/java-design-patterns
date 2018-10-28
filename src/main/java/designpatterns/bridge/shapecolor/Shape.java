package designpatterns.bridge.shapecolor;

public abstract class Shape {

  private final Color color;
  
  public Shape(Color color) {
    this.color = color;
  }
  
  public Color getColor() {
    return color;
  }
  
  public abstract void applyColor();
  
}
