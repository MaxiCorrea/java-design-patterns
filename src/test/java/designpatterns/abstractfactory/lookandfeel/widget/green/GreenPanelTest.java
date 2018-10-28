package designpatterns.abstractfactory.lookandfeel.widget.green;

import static org.junit.Assert.*;
import java.awt.Color;
import org.junit.Test;

public class GreenPanelTest {

  @Test
  public void testColor() {
    GreenPanel greenPanel = new GreenPanel();
    assertEquals(new Color(0, 80, 71) , greenPanel.getBackground());
  }

}
