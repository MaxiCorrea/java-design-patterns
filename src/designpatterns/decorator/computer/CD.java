package designpatterns.decorator.computer;

public class CD extends ComponentDecorator {

  public CD(Component decorated) {
    super(decorated);
  }
  
  @Override
  public String getDescription() {
    return getDecorated().getDescription() + " + CD";
  }

}
