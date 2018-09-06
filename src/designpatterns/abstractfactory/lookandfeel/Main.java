package designpatterns.abstractfactory.lookandfeel;

import designpatterns.abstractfactory.lookandfeel.widget.WidgetFactory;
import designpatterns.abstractfactory.lookandfeel.widget.green.WidgetGreenFactory;

public class Main {

  public static void main(String[] args) {
    WidgetFactory widgetFactory = new WidgetGreenFactory();
    new CalculatorWindow(widgetFactory);
  }
  
}
