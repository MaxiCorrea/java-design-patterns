package designpatterns.facade;

public class Facade {

  private Class1 class1;
  private Class2 class2;
  private Class3 class3;
  private Class4 class4;
  private Class5 class5;

  public Facade(Class1 class1, Class2 class2, Class3 class3, Class4 class4, Class5 class5) {
    this.class1 = class1;
    this.class2 = class2;
    this.class3 = class3;
    this.class4 = class4;
    this.class5 = class5;
  }

  public void operation() {
    class1.operation();
    class2.operation();
    class3.operation();
    class4.operation();
    class5.operation();
  }

}
