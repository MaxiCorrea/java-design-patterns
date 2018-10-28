package designpatterns.flyweight.forest;

import java.awt.Color;

public class Demo {

  static int CANVAS_SIZE = 500;
  static int TREES_TO_DRAW = 10000;
  static int TREE_TYPES = 2;

  public static void main(String[] args) {
    Forest forest = new Forest(CANVAS_SIZE, new TreeFactory());
    for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
      forest.addPlantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Summer Oak",
          Color.GREEN);
      forest.addPlantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Autumn Oak",
          Color.ORANGE);
    }
    forest.show();
  }

  private static int random(int min, int max) {
    return min + (int) (Math.random() * ((max - min) + 1));
  }

}
