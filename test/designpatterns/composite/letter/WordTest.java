package designpatterns.composite.letter;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WordTest {

  private ByteArrayOutputStream stdOutBuffer;
  private final PrintStream realStdOut = System.out;

  @Before
  public void setup() {
    stdOutBuffer = new ByteArrayOutputStream();
    System.setOut(new PrintStream(stdOutBuffer));
  }

  @Test
  public void testPrint() {
    Word word = new Word(asList(new Letter('M'), new Letter('a'),
                new Letter('x'), new Letter('y')));
    word.print();
    assertEquals("Maxy" , String.valueOf(stdOutBuffer).trim());
  }

  @After
  public void teardown() {
    System.setOut(realStdOut);
  }

}
