package designpatterns.adapter.dialler;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class DiallerTest {

  private Dialler dialler;

  @Before
  public void setup() {
    dialler = new Dialler();
  }

  @Test
  public void shouldBeInitiallyEmpty() {
    assertTrue(dialler.isEmpty());
    assertFalse(dialler.containsDigit(0));
  }

  @Test
  public void shouldBeAbleToStoreADigit() {
    dialler.pressDigit(10);
    assertFalse(dialler.isEmpty());
    assertTrue(dialler.containsDigit(10));
  }

  @Test
  public void shouldBeAbleToStoreSeveralDigits() {
    pressDigitsToDialler(1, 22, 33, 44, 56);
    contrainsAllDigits(1, 22, 33, 44, 56);
  }

  private void pressDigitsToDialler(int... digits) {
    for (int x : digits) {
      dialler.pressDigit(x);
    }
    assertFalse(dialler.isEmpty());
  }

  private void contrainsAllDigits(int... digits) {
    for (int x : digits) {
      assertTrue(dialler.containsDigit(x));
    }
  }

}
