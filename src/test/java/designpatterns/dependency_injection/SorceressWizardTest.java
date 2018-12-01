package designpatterns.dependency_injection;

import static org.junit.Assert.*;
import org.junit.Test;

public class SorceressWizardTest extends BaseIOTest {

  @Test
  public void test() {

    Tobacoo tobacoo = new SecondBreakfastTobacoo();
    SorceressWizard wizard = new SorceressWizard();
    wizard.setTobacoo(tobacoo);

    wizard.smoke();

    String expected = "smoking SorceressWizard SecondBreakfastTobacoo";
    String actual = String.valueOf(output).trim();
    assertEquals(expected, actual);

  }

}
