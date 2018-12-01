package designpatterns.dependency_injection;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SimpleWizardTest extends BaseIOTest {

  @Test
  public void testInjection() {
    
    Tobacoo tobacoo = new OldTobyTobacoo();
    Wizard wizard = new SimpleWizard(tobacoo);
    
    wizard.smoke();
    
    String expected = "smoking SimpleWizard OldTobyTobacoo";
    String actual = String.valueOf(output).trim();
    assertEquals(expected , actual);
  }

}
