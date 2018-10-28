package designpatterns.singleton.threadsafe;

public class SingletonLazyLoaded {

  private static SingletonLazyLoaded instance;

  private SingletonLazyLoaded() {
    if (instance == null) {
      instance = this;
    } else {
      throw new IllegalStateException("Already initialized.");
    }
  }

  public static synchronized SingletonLazyLoaded getInstance() {
    if (instance == null) {
      instance = new SingletonLazyLoaded();
    }
    return instance;
  }

}
