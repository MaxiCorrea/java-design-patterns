package designpatterns.decorator.computer;

public abstract class ComponentDecorator extends Component {

  private final Component decorated;
  
  public ComponentDecorator(Component decorated) {
    this.decorated = decorated;
  }
  
  public Component getDecorated() {
    return decorated;
  }
  
}
