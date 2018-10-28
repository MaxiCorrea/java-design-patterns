package designpatterns.abstractfactory.lookandfeel.widget;

import javax.swing.JButton;

public abstract class WidgetButton extends JButton {

  private static final long serialVersionUID = 1L;

  public WidgetButton() {
    setFocusPainted(false);
    setBorder(null);
  }
  
}
