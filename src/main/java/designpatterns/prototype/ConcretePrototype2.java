package designpatterns.prototype;

public class ConcretePrototype2 extends Prototype {

  private String str;

  public ConcretePrototype2(String str) {
    this.str = str;
  }

  public ConcretePrototype2(ConcretePrototype2 other) {
    this.str = other.str;
  }

  public String getStr() {
    return str;
  }
  
  @Override
  ConcretePrototype2 copyOfSelf() {
    return new ConcretePrototype2(this);
  }

}
