package designpatterns.builder;

import static org.junit.Assert.*;
import org.junit.Test;

public class ConcreteBuilderTest {

  @Test
  public void test() {
    ConcreteBuilder builder = new ConcreteBuilder();
    builder.buildPart1();
    builder.buildPart2();
    Product product = builder.build();
    assertNotNull(product);
    assertEquals("The Part1" , product.getPart1());
    assertEquals("The Part2" , product.getPart2());
  }

}
