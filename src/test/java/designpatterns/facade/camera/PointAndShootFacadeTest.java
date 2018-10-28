package designpatterns.facade.camera;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PointAndShootFacadeTest {

  private ByteArrayOutputStream output;
  private PrintStream original = System.out;

  @Before
  public void setup() {
    output = new ByteArrayOutputStream();
    System.setOut(new PrintStream(output));
  }

  @Test
  public void testTakePicture() {
    PointAndShootFacade facade = new PointAndShootFacade();
    facade.takePicture();
    String expected = "Open shutter for 0,017 seconds";
    assertEquals(expected, String.valueOf(output).trim());
  }

  @After
  public void reset() {
    System.setOut(original);
  }

}
