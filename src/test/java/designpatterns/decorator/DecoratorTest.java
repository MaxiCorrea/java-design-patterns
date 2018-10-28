package designpatterns.decorator;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DecoratorTest {

  private ByteArrayOutputStream stdOutBuffer;
  private final PrintStream realStdOut = System.out;

  @Before
  public void setup() {
    stdOutBuffer = new ByteArrayOutputStream();
    System.setOut(new PrintStream(stdOutBuffer));
  }

  @Test
  public void testDoubleDecorator() {
    ConcreteDecoratorA decoratorA = new ConcreteDecoratorA(new ConcreteComponent());
    ConcreteDecoratorB decoratorB = new ConcreteDecoratorB(decoratorA);
    decoratorB.operation();
    String expectedOutput =
        "oooooooooooooo\n<------------>\nConcreteComponent\n<------------>\noooooooooooooo";
    assertEquals(expectedOutput, String.valueOf(stdOutBuffer).trim());
  }

  @After
  public void teardown() {
    System.setOut(realStdOut);
  }

}
