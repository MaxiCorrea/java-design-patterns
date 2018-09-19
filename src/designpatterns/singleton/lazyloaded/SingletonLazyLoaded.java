package designpatterns.singleton.lazyloaded;

public class SingletonLazyLoaded {

  private static SingletonLazyLoaded instance;

  private SingletonLazyLoaded() {}

  public static final SingletonLazyLoaded getInstance() {
    if(instance == null) {
      instance = new SingletonLazyLoaded();
    }
    return instance;
  }
  
}
