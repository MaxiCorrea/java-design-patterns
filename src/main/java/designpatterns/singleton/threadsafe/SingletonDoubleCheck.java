package designpatterns.singleton.threadsafe;

public class SingletonDoubleCheck {

  private static volatile SingletonDoubleCheck INSTANCE;

  private SingletonDoubleCheck() {
    if (INSTANCE == null) {
      INSTANCE = this;
    } else {
      throw new IllegalStateException("Already initialized.");
    }
  }

  public static SingletonDoubleCheck getInstance() {
    SingletonDoubleCheck result = INSTANCE;
    if(result == null) {
      synchronized (SingletonDoubleCheck.class) {
        result = INSTANCE;
        if(result == null) {
          INSTANCE = result = new SingletonDoubleCheck();
        }
      }
    }
    return INSTANCE;
  }
  
}
