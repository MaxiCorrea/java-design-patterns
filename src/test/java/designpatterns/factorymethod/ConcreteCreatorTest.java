package designpatterns.factorymethod;

import static org.junit.Assert.*;
import org.junit.Test;

public class ConcreteCreatorTest {

  @Test
  public void shouldCreateAnInstanceOfTheConcreteProductClass() {
    ConcreteCreator concreteCreator = new ConcreteCreator();
    assertNotNull(concreteCreator.factoryMethod());
    assertTrue(concreteCreator.factoryMethod() instanceof ConcreteProduct);
  }

}
