package designpatterns.flyweight.forest;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

  private Map<String, TreeType> pool;

  public TreeFactory() {
    pool = new HashMap<>();
  }

  public TreeType getTreeType(String name , Color color) {
    TreeType treeType = pool.get(name);
    if(treeType == null) {
      treeType = new TreeType(name, color);
      pool.put(name , treeType);
    }
    return treeType;
  }

}
