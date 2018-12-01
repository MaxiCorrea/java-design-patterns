package designpatterns.dependency_injection;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;

public class BaseIOTest {

  ByteArrayOutputStream output;
  PrintStream original;

  @Before
  public void setUp() {
    original = System.out;
    output = new ByteArrayOutputStream();
    System.setOut(new PrintStream(output));
  }

  @After
  public void reset() {
    System.setOut(original);
  }

}
