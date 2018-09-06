package designpatterns.abstractfactory.lookandfeel.widget.green;

import java.awt.Color;
import designpatterns.abstractfactory.lookandfeel.widget.WidgetDisplay;

class GreenDisplay extends WidgetDisplay {
  private static final long serialVersionUID = 1L;

  GreenDisplay() {
    setBackground(Color.CYAN);
    setForeground(Color.BLACK);
  }

}
