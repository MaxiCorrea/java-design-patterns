package designpatterns.dependency_injection;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceWizardTest extends BaseIOTest {

  @Test
  public void testInjection() {
    
    Injector injector = Guice.createInjector(new TobaccoModule());
    GuiceWizard wizard = injector.getInstance(GuiceWizard.class);
    
    wizard.smoke();
    
    String expected = "smoking GuiceWizard RevendellTobacoo";
    String actual = String.valueOf(output).trim();
    assertEquals(expected , actual);
    
  }

}
