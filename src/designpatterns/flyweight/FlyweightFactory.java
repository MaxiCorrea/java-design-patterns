package designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

  private final Map<String, Flyweight> pool;

  public FlyweightFactory() {
    pool = new HashMap<>();
  }

  public Flyweight getFlyweight(String key) {
    Flyweight flyweight = pool.get(key);
    if (flyweight == null) {
      flyweight = new ConcreteFlyweight();
      pool.put(key, flyweight);
    }
    return flyweight;
  }

  public Flyweight createUnsharedConcreteFlyweight() {
    return new UnsharedConcreteFlyweight();
  }

}
