package designpatterns.flyweight.forest;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class Forest {

  private JFrame frame;
  private List<Tree> trees;
  private TreeFactory factory;

  public Forest(int size , TreeFactory factory) {
    frame = new JFrame();
    frame.setSize(size, size);
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    trees = new ArrayList<>();
    this.factory = factory;
  }

  public void addPlantTree(int x, int y, String name, Color color) {
    trees.add(new Tree(x, y, factory.getTreeType(name, color)));
  }

  public void show() {
    frame.setVisible(true);
    paint();
  }
  
  private void paint() {
    final Graphics graphics = frame.getGraphics();
    for (Tree tree : trees) {
      tree.draw(graphics);
    }
  }

}
