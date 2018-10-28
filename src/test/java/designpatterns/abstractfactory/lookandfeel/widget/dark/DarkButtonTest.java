package designpatterns.abstractfactory.lookandfeel.widget.dark;

import static org.junit.Assert.*;
import java.awt.Color;
import org.junit.Test;

public class DarkButtonTest {

  @Test
  public void testColor() {
    DarkButton button = new DarkButton();
    assertEquals(Color.BLACK , button.getBackground());
    assertEquals(Color.WHITE , button.getForeground());
  }

}
