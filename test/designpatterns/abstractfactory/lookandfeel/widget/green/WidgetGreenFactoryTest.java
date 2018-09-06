package designpatterns.abstractfactory.lookandfeel.widget.green;

import static org.junit.Assert.*;
import org.junit.Test;

public class WidgetGreenFactoryTest {

  @Test
  public void testCreate() {
    WidgetGreenFactory greenFactory = new WidgetGreenFactory();
    assertTrue(greenFactory.createButton() instanceof GreenButton);
    assertTrue(greenFactory.createDisplay() instanceof GreenDisplay);
    assertTrue(greenFactory.createPane() instanceof GreenPanel);
  }

}
