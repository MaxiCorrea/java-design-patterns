package designpatterns.abstractfactory.lookandfeel.widget;

public abstract class WidgetFactory {

  public abstract WidgetButton createButton();
  
  public abstract WidgetDisplay createDisplay();
  
  public abstract WidgetPanel createPane();
  
}
