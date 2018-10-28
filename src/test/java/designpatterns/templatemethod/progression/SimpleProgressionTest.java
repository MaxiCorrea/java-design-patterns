package designpatterns.templatemethod.progression;

import static org.junit.Assert.*;
import org.junit.Test;

public class SimpleProgressionTest {

  @Test
  public void testProgressionFromZeroToTen() {
    SimpleProgression progression = new SimpleProgression();
    assertEquals(0 , progression.nextValue());
    assertEquals(1 , progression.nextValue());
    assertEquals(2 , progression.nextValue());
    assertEquals(3 , progression.nextValue());
    assertEquals(4 , progression.nextValue());
    assertEquals(5 , progression.nextValue());
    assertEquals(6 , progression.nextValue());
    assertEquals(7 , progression.nextValue());
    assertEquals(8 , progression.nextValue());
    assertEquals(9 , progression.nextValue());
    assertEquals(10 , progression.nextValue());
  }

}
