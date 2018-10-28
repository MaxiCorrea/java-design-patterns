package designpatterns.flyweight.forest;

import java.awt.Color;
import java.awt.Graphics;

public class TreeType {

  private final String name;
  private final Color color;
  
  public TreeType(String name , Color color) {
    this.name = name;
    this.color = color;
  }
  
  public String getName() {
    return name;
  }
  
  public Color getColor() {
    return color;
  }
  
  public void draw(Graphics graphics, int x, int y) {
    graphics.setColor(Color.BLACK);
    graphics.fillRect(x - 1, y, 3, 5);
    graphics.setColor(getColor());
    graphics.fillOval(x - 5, y - 10, 10, 10);
  }

}
