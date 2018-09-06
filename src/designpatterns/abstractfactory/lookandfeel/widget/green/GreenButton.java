package designpatterns.abstractfactory.lookandfeel.widget.green;

import java.awt.Color;
import designpatterns.abstractfactory.lookandfeel.widget.WidgetButton;

class GreenButton extends WidgetButton {
  private static final long serialVersionUID = 1L;

  GreenButton() {
    setBackground(new Color(0, 97, 87));
    setForeground(Color.BLACK);
  }
  
}
