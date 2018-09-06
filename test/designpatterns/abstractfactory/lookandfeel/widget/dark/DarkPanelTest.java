package designpatterns.abstractfactory.lookandfeel.widget.dark;

import static org.junit.Assert.*;
import java.awt.Color;
import org.junit.Test;

public class DarkPanelTest {

  @Test
  public void testColor() {
   DarkPanel darkPanel = new DarkPanel();
   assertEquals(Color.DARK_GRAY , darkPanel.getBackground());
  }

}
