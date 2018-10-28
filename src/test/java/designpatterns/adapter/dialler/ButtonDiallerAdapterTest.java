package designpatterns.adapter.dialler;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ButtonDiallerAdapterTest extends Dialler {

  private boolean pressDigitCalled;
  private Integer digitExpected;
  private ButtonDiallerAdapter adapter;
  
  @Before
  public void setup() {
    pressDigitCalled = false;
    digitExpected = null;
    adapter = new ButtonDiallerAdapter(this);
  }
  
  @Test
  public void shouldDelegateThePressOfTheButtonToTheDiallerObject() {
    assertFalse(pressDigitCalled);
    assertNull(digitExpected);
    adapter.buttonPressed(5);
    assertTrue(pressDigitCalled);
    assertEquals(5 , digitExpected.intValue());
  }

  @Override
  public void pressDigit(int digit) {
    digitExpected = digit;
    pressDigitCalled = true;
  }
  
}
