package designpatterns.facade;

import static java.lang.String.valueOf;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FacadeTest {

  private ByteArrayOutputStream output;
  private final PrintStream stardard = System.out;

  @Before
  public void setUp() {
    output = new ByteArrayOutputStream();
    System.setOut(new PrintStream(output));
  }

  @Test
  public void shouldInvokeTheObjectsOfTheSubsystem() {
    Facade facade =
        new Facade(new Class1(), new Class2(), new Class3(), new Class4(), new Class5());
    facade.operation();
    String expected = "Class1->operation()\n"
        + "Class2->operation()\n"
        + "Class3->operation()\n"
        + "Class4->operation()\n"
        + "Class5->operation()";
    assertEquals(expected, valueOf(output).trim());
  }

  @After
  public void reset() {
    System.setOut(stardard);
  }

}
