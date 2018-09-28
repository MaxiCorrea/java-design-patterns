package designpatterns.decorator;

public abstract class Decorator extends Component {

  private Component decorated;
  
  public Decorator(Component decorated) {
    this.decorated = decorated;
  }
  
  public Component getDecorated() {
    return decorated;
  }
  
}
