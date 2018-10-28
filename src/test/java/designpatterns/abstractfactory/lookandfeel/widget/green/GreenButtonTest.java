package designpatterns.abstractfactory.lookandfeel.widget.green;

import static org.junit.Assert.*;
import java.awt.Color;
import org.junit.Test;

public class GreenButtonTest {

  @Test
  public void testColor() {
    GreenButton button = new GreenButton();
    assertEquals(new Color(0, 97, 87) , button.getBackground());
    assertEquals(Color.BLACK , button.getForeground());
  }

}
