package designpatterns.facade;

public class Client2 {

  private Class1 class1;
  private Class2 class2;
  private Class3 class3;
  
  public Client2(Class1 class1, Class2 class2, Class3 class3) {
    this.class1 = class1;
    this.class2 = class2;
    this.class3 = class3;
  }
  
  public void operation() {
    class1.operation();
    class2.operation();
    class3.operation();
  }
  
}
