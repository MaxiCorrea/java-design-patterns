package designpatterns.flyweight.forest;

import java.awt.Graphics;

public class Tree {

  private final int x;
  private final int y;
  private final TreeType flyweightType;

  public Tree(int x, int y, TreeType flyweightType) {
    this.x = x;
    this.y = y;
    this.flyweightType = flyweightType;
  }

  public void draw(Graphics graphics) {
    flyweightType.draw(graphics, x, y);
  }

}
