package designpatterns.abstractfactory.lookandfeel.widget;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;

public abstract class WidgetDisplay extends JTextField {

  private static final long serialVersionUID = 1L;
  private static final int WIDTH = 255;
  private static final int HEIGHT = 50;

  public WidgetDisplay() {
    setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    setHorizontalAlignment(JTextField.RIGHT);
  }

}
