package designpatterns.abstractfactory.lookandfeel.widget.green;

import static org.junit.Assert.assertEquals;
import java.awt.Color;
import org.junit.Test;

public class GreenDisplayTest {

  @Test
  public void test() {
    GreenDisplay display = new GreenDisplay();
    assertEquals(Color.CYAN, display.getBackground());
    assertEquals(Color.BLACK, display.getForeground());
  }

}
