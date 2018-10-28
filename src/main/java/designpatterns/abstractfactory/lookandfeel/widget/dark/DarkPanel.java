package designpatterns.abstractfactory.lookandfeel.widget.dark;

import java.awt.Color;
import designpatterns.abstractfactory.lookandfeel.widget.WidgetPanel;

class DarkPanel extends WidgetPanel {
  private static final long serialVersionUID = 1L;

  DarkPanel() {
    setBackground(Color.DARK_GRAY);
  }
  
}
