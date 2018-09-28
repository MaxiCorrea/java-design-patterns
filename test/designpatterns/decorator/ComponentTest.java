package designpatterns.decorator;

import static java.lang.String.valueOf;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ComponentTest {

  private ByteArrayOutputStream stdOutBuffer;
  private final PrintStream realStdOut = System.out;

  @Before
  public void setup() {
    stdOutBuffer = new ByteArrayOutputStream();
    System.setOut(new PrintStream(stdOutBuffer));
  }
 
  @Test
  public void testOperation() {
    ConcreteComponent component = new ConcreteComponent();
    component.operation();
    assertEquals("ConcreteComponent" , valueOf(stdOutBuffer).trim());
  }

  @After
  public void teardown() {
    System.setOut(realStdOut);
  }
  
}
