package designpatterns.adapter;

public class AdapterObject implements Target {

  private Adaptee adaptee;
  
  public AdapterObject(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public void request() {
    adaptee.specificRequest();
  }
  
}
