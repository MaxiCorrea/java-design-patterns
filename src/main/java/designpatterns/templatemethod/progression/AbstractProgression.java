package designpatterns.templatemethod.progression;

public abstract class AbstractProgression {

  private static final int DEFAULT_INITIAL_VALUE = 0;
  
  private int currentValue;

  public AbstractProgression() {
    this(DEFAULT_INITIAL_VALUE);
  }
  
  public AbstractProgression(int startValue) {
    currentValue = startValue;
  }
  
  public int getCurrentValue() {
    return currentValue;
  }

  public final int nextValue() {
    int answer = currentValue;
    currentValue = advance();
    return answer;
  }

  abstract int advance();
  
}
