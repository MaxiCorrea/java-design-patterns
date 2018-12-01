package designpatterns.dependency_injection;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringWizardTest extends BaseIOTest {

  private SpringWizard wizard;
  
  @Before
  public void setUp() {
    super.setUp();
    try(ClassPathXmlApplicationContext context = 
        new ClassPathXmlApplicationContext("applicationContext.xml")) {
      wizard = (SpringWizard) context.getBean("springWizard");
    }
  }
  
  @Test
  public void test() {
    wizard.smoke();
    String expected = "smoking SpringWizard OldTobyTobacoo";
    String actual = String.valueOf(output).trim();
    assertEquals(expected, actual);
  }

}
