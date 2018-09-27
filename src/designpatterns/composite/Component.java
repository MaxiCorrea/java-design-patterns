package designpatterns.composite;

public abstract class Component {

  abstract void operation();
  
  void add(Component component) {}
  
  void remove(Component component) {}
  
}
