package designpatterns.templatemethod.progression;

import static org.junit.Assert.*;
import org.junit.Test;

public class FibonacciProgressionTest {

  @Test
  public void testFibonacciProgression() {
    FibonacciProgression progression = new FibonacciProgression();
    assertEquals(0 , progression.nextValue());
    assertEquals(1 , progression.nextValue());
    assertEquals(1 , progression.nextValue());
    assertEquals(2 , progression.nextValue());
    assertEquals(3 , progression.nextValue());
    assertEquals(5 , progression.nextValue());
    assertEquals(8 , progression.nextValue());
    assertEquals(13 , progression.nextValue());    
  }

}
