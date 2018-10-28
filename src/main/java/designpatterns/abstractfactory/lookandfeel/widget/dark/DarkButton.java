package designpatterns.abstractfactory.lookandfeel.widget.dark;

import java.awt.Color;
import designpatterns.abstractfactory.lookandfeel.widget.WidgetButton;

class DarkButton extends WidgetButton {
  private static final long serialVersionUID = 1L;

  DarkButton() {
    super();
    setBackground(Color.BLACK);
    setForeground(Color.WHITE);
  }
  
}
