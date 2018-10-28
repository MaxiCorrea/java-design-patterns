package designpatterns.adapter.dialler;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ButtonTest implements ButtonListener {

  private static final int DIGIT = 50;
  private boolean buttonPressedCalled;

  private Button button = new Button(this, DIGIT);

  @Before
  public void setup() {
    buttonPressedCalled = false;
  }

  @Test
  public void shouldCallTheListenerWhenTheButtonIsPressed() {
    assertFalse(buttonPressedCalled);
    button.press();
    assertTrue(buttonPressedCalled);
  }

  @Override
  public void buttonPressed(int digit) {
    assertEquals(DIGIT , digit);
    buttonPressedCalled = true;
  }

}
