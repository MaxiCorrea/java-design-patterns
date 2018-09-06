package designpatterns.abstractfactory.lookandfeel.widget.green;

import designpatterns.abstractfactory.lookandfeel.widget.WidgetButton;
import designpatterns.abstractfactory.lookandfeel.widget.WidgetDisplay;
import designpatterns.abstractfactory.lookandfeel.widget.WidgetFactory;
import designpatterns.abstractfactory.lookandfeel.widget.WidgetPanel;

public class WidgetGreenFactory extends WidgetFactory {

  @Override
  public WidgetButton createButton() {
    return new GreenButton();
  }

  @Override
  public WidgetDisplay createDisplay() {
    return new GreenDisplay();
  }

  @Override
  public WidgetPanel createPane() {
    return new GreenPanel();
  }

}
