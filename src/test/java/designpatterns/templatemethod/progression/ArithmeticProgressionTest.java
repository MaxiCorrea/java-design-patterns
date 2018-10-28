package designpatterns.templatemethod.progression;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArithmeticProgressionTest {

  @Test
  public void testPrograssionTwoByTwo() {
    ArithmeticProgression progression = new ArithmeticProgression(2);
    assertEquals(0 , progression.nextValue());
    assertEquals(2 , progression.nextValue());
    assertEquals(4 , progression.nextValue());
    assertEquals(6 , progression.nextValue());
    assertEquals(8 , progression.nextValue());
    assertEquals(10 , progression.nextValue());
    assertEquals(12 , progression.nextValue());
    assertEquals(14 , progression.nextValue());
    assertEquals(16 , progression.nextValue());
    assertEquals(18 , progression.nextValue());
    assertEquals(20 , progression.nextValue());
  }

  @Test
  public void testPrograssionFiveByFive() {
    ArithmeticProgression progression = new ArithmeticProgression(5);
    assertEquals(0 , progression.nextValue());
    assertEquals(5 , progression.nextValue());
    assertEquals(10 , progression.nextValue());
    assertEquals(15 , progression.nextValue());
    assertEquals(20 , progression.nextValue());
    assertEquals(25 , progression.nextValue());
    assertEquals(30 , progression.nextValue());
    assertEquals(35 , progression.nextValue());
    assertEquals(40 , progression.nextValue());
    assertEquals(45 , progression.nextValue());
    assertEquals(50 , progression.nextValue());
  }
  
}
