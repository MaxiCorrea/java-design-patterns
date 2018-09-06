package designpatterns.abstractfactory.lookandfeel.widget.dark;

import static org.junit.Assert.*;
import java.awt.Color;
import org.junit.Test;

public class DarkDisplayTest {

  @Test
  public void testColor() {
    DarkDisplay darkDisplay = new DarkDisplay();
    assertEquals(Color.BLACK, darkDisplay.getBackground());
    assertEquals(Color.YELLOW, darkDisplay.getForeground());
  }

}
