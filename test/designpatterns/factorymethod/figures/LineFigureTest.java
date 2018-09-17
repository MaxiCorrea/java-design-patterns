package designpatterns.factorymethod.figures;

import static org.junit.Assert.*;
import org.junit.Test;

public class LineFigureTest {

  @Test
  public void theFactoryMethodShouldReturnALineManipulatorObject() {
    LineFigure figure = new LineFigure();
    AbstractManipulator manipulator = figure.createManipulator();
    assertNotNull(manipulator);
    assertEquals(LineManipulator.class , manipulator.getClass());
  }

}
