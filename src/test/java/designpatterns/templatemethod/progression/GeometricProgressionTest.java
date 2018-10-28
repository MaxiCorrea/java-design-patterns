package designpatterns.templatemethod.progression;

import static org.junit.Assert.*;
import org.junit.Test;

public class GeometricProgressionTest {

  @Test
  public void testSimpleGeometricProgressionZeroTo() {
    GeometricProgression progression = new GeometricProgression(1 , 2);
    assertEquals(1 , progression.nextValue());
    assertEquals(2 , progression.nextValue());
    assertEquals(4 , progression.nextValue());
    assertEquals(8 , progression.nextValue());
    assertEquals(16 , progression.nextValue());
    assertEquals(32 , progression.nextValue());
    assertEquals(64 , progression.nextValue());
  }

}
