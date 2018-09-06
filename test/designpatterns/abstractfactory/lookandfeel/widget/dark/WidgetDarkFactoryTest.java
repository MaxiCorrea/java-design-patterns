package designpatterns.abstractfactory.lookandfeel.widget.dark;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class WidgetDarkFactoryTest {

  @Test
  public void testCreate() {
    WidgetDarkFactory darkFactory = new WidgetDarkFactory();
    assertTrue(darkFactory.createButton() instanceof DarkButton);
    assertTrue(darkFactory.createDisplay() instanceof DarkDisplay);
    assertTrue(darkFactory.createPane() instanceof DarkPanel);
  }

}
