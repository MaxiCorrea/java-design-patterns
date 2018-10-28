package designpatterns.abstractfactory.lookandfeel.widget.dark;

import java.awt.Color;
import designpatterns.abstractfactory.lookandfeel.widget.WidgetDisplay;

class DarkDisplay extends WidgetDisplay {
  private static final long serialVersionUID = 1L;

  DarkDisplay() {
    setBackground(Color.BLACK);
    setForeground(Color.YELLOW);
  }
  
}
