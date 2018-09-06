package designpatterns.abstractfactory.lookandfeel;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.NORTH;
import javax.swing.JFrame;
import designpatterns.abstractfactory.lookandfeel.widget.WidgetButton;
import designpatterns.abstractfactory.lookandfeel.widget.WidgetDisplay;
import designpatterns.abstractfactory.lookandfeel.widget.WidgetFactory;
import designpatterns.abstractfactory.lookandfeel.widget.WidgetPanel;

public class CalculatorWindow extends JFrame {

  private static final long serialVersionUID = 1L;
  private static final String APP_TITLE = "Abstract Factory Example";
  private static final String[] TEXTS = {"C", "DEL", "%", "/", "7", "8", "9", "x", "4", "5", "6",
      "-", "1", "2", "3", "+", "0", ".", "ANS", "="};

  public CalculatorWindow(WidgetFactory widgetFactory) {
    super(APP_TITLE);
    setSize(250, 320);

    WidgetDisplay display = widgetFactory.createDisplay();
    display.setText("Infinity ");
    add(NORTH, display);

    WidgetPanel panel = widgetFactory.createPane();

    for (String text : TEXTS) {
      WidgetButton button = widgetFactory.createButton();
      button.setText(text);
      panel.add(button);
    }

    add(CENTER, panel);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setResizable(false);
    setVisible(true);
  }

}
