package designpatterns.builder;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DirectorTest extends Builder {

  private boolean buildPart1Called;
  private boolean buildPart2Called;
  private boolean buildCalled;
  
  @Before
  public void setup() {
    buildPart1Called = false;
    buildPart2Called = false;
    buildCalled = false;
  }
  
  @Test
  public void test() {
    assertFalse(buildPart1Called);
    assertFalse(buildPart2Called);
    assertFalse(buildCalled);
    Director director = new Director(this);
    director.construct();
    assertTrue(buildPart1Called);
    assertTrue(buildPart2Called);
    assertTrue(buildCalled);
  }

  @Override
  void buildPart1() {
    buildPart1Called = true;
  }

  @Override
  void buildPart2() {
    buildPart2Called = true;
  }

  @Override
  Product build() {
    buildCalled = true;
    return null;
  }

}
