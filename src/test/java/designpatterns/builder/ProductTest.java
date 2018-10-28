package designpatterns.builder;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProductTest {

  @Test
  public void test() {
    Product product = new Product();
    product.setPart1("A");
    product.setPart2("B");
    assertEquals("A" , product.getPart1());
    assertEquals("B" , product.getPart2());
  }

}
