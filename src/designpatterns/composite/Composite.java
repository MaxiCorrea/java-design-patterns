package designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

  private List<Component> components;
  
  public Composite() {
    components = new ArrayList<>();
  }
  
  @Override
  void add(Component component) {
    components.add(component);
  }
  
  @Override
  void remove(Component component) {
    components.remove(component);
  }
  
  @Override
  void operation() {
    for(Component each : components) {
      each.operation();
    }
  }

}
