package designpatterns.abstractfactory.lookandfeel.widget.dark;

import designpatterns.abstractfactory.lookandfeel.widget.WidgetButton;
import designpatterns.abstractfactory.lookandfeel.widget.WidgetDisplay;
import designpatterns.abstractfactory.lookandfeel.widget.WidgetFactory;
import designpatterns.abstractfactory.lookandfeel.widget.WidgetPanel;

public class WidgetDarkFactory extends WidgetFactory {

  @Override
  public WidgetButton createButton() {
    return new DarkButton();
  }

  @Override
  public WidgetDisplay createDisplay() {
    return new DarkDisplay();
  }

  @Override
  public WidgetPanel createPane() {
    return new DarkPanel();
  }

}
