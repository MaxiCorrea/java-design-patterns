package designpatterns.flyweight;

import static org.junit.Assert.*;
import org.junit.Test;

public class FlyweightFactoryTest {

  @Test
  public void testShared() {
    FlyweightFactory factory = new FlyweightFactory();
    Flyweight flyweight1 = factory.getFlyweight("X");
    assertNotNull(flyweight1);
    Flyweight flyweight2 = factory.getFlyweight("X");
    assertNotNull(flyweight2);
    assertSame(flyweight1, flyweight2);
  }
  
  @Test
  public void testUnshared() {
    FlyweightFactory factory = new FlyweightFactory();
    Flyweight flyweight3 = factory.createUnsharedConcreteFlyweight();
    assertNotNull(flyweight3);
    Flyweight flyweight4 = factory.createUnsharedConcreteFlyweight();
    assertNotNull(flyweight4);
    assertNotSame(flyweight3, flyweight4);
  }

}
