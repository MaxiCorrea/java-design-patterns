package designpatterns.factorymethod.parallelhierarchy;

import static org.junit.Assert.*;
import org.junit.Test;
import designpatterns.factorymethod.parallelhierarchy.AbstractManipulator;
import designpatterns.factorymethod.parallelhierarchy.TextFigure;
import designpatterns.factorymethod.parallelhierarchy.TextManipulator;

public class TextFigureTest {

  @Test
  public void theFactoryMethodShouldReturnATextManipulatorObject() {
    TextFigure figure = new TextFigure();
    AbstractManipulator manipulator = figure.createManipulator();
    assertNotNull(manipulator);
    assertEquals(TextManipulator.class , manipulator.getClass());
  }

}
