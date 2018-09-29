package designpatterns.decorator.computer;

public abstract class Component {

  private String description;
  
  public Component(String description) {
    this.description = description;
  }
  
  public String getDescription() {
    return description;
  }
 
}
