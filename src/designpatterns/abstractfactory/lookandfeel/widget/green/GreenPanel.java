package designpatterns.abstractfactory.lookandfeel.widget.green;

import java.awt.Color;
import designpatterns.abstractfactory.lookandfeel.widget.WidgetPanel;

class GreenPanel extends WidgetPanel {
  private static final long serialVersionUID = 1L;

  GreenPanel() {
    setBackground(new Color(0, 80, 71));
  }
  
}
