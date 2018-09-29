package designpatterns.decorator.computer;

public class Disk extends ComponentDecorator {

  public Disk(Component decorated) {
    super(decorated);
  }

  @Override
  public String getDescription() {
    return getDecorated().getDescription() + " + Disk";
  }
  
}
