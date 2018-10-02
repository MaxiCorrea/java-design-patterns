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
    if (flyweight != null) {
      return flyweight;
    }

    if ("ConcreteFlyweight".equals(key)) {
      flyweight = new ConcreteFlyweight();
    } else if (key.equals("UnsharedConcreteFlyweiht")) {
      flyweight = new UnsharedConcreteFlyweight();
    } else {
      throw new IllegalArgumentException("Invalid key : " + key);
    }
    
    pool.put(key, flyweight);
    return flyweight;
  }

}
