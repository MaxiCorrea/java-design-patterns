package designpatterns.composite.letter;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LetterTest {

  private ByteArrayOutputStream stdOutBuffer;
  private final PrintStream realStdOut = System.out;

  @Before
  public void setup() {
    stdOutBuffer = new ByteArrayOutputStream();
    System.setOut(new PrintStream(stdOutBuffer));
  }

  @Test
  public void testPrint() {
    Letter letter = new Letter('A');
    letter.print();
    assertEquals("A" , String.valueOf(stdOutBuffer));
  }
  
  @After
  public void teardown() {
    System.setOut(realStdOut);
  }

}
