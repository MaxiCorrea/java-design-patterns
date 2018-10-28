package designpatterns.factorymethod.parallelhierarchy;

import static org.junit.Assert.*;
import org.junit.Test;
import designpatterns.factorymethod.parallelhierarchy.AbstractManipulator;
import designpatterns.factorymethod.parallelhierarchy.LineFigure;
import designpatterns.factorymethod.parallelhierarchy.LineManipulator;

public class LineFigureTest {

  @Test
  public void theFactoryMethodShouldReturnALineManipulatorObject() {
    LineFigure figure = new LineFigure();
    AbstractManipulator manipulator = figure.createManipulator();
    assertNotNull(manipulator);
    assertEquals(LineManipulator.class , manipulator.getClass());
  }

}
