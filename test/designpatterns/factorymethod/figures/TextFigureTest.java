package designpatterns.factorymethod.figures;

import static org.junit.Assert.*;
import org.junit.Test;

public class TextFigureTest {

  @Test
  public void theFactoryMethodShouldReturnATextManipulatorObject() {
    TextFigure figure = new TextFigure();
    AbstractManipulator manipulator = figure.createManipulator();
    assertNotNull(manipulator);
    assertEquals(TextManipulator.class , manipulator.getClass());
  }

}
