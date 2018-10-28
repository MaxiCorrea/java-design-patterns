package designpatterns.prototype;

public class ConcretePrototype1 extends Prototype {

  private String str;
  
  public ConcretePrototype1(String str) {
    this.str = str;
  }
  
  public ConcretePrototype1(ConcretePrototype1 other) {
    this.str = other.str;
  }
  
  public String getStr() {
    return str;
  }
  
  @Override
  ConcretePrototype1 copyOfSelf() {
    return new ConcretePrototype1(this);
  }

}
