package designpatterns.decorator.computer;

public class Monitor extends ComponentDecorator {

  public Monitor(Component decorated) {
    super(decorated);
  }
  
  @Override
  public String getDescription() {
    return getDecorated().getDescription() + " + Monitor";
  }

}
