package designpatterns.adapter;

public class AdapterClass extends Adaptee implements Target {

  @Override
  public void request() {
    super.specificRequest();
  }

}
