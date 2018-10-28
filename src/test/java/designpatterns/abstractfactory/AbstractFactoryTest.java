package designpatterns.abstractfactory;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AbstractFactoryTest {

  private AbstractFactory concreteFactory1;
  private AbstractFactory concreteFactory2;

  @Before
  public void init() {
    concreteFactory1 = new ConcreteFactory1();
    concreteFactory2 = new ConcreteFactory2();
  }

  @Test
  public void testConcreteFactory1() {
    AbstractProductA abstractProductA = concreteFactory1.createProductA();
    assertNotNull(abstractProductA);
    assertTrue(abstractProductA instanceof ConcreteProductA1);
    AbstractProductB abstractProductB = concreteFactory1.createProductB();
    assertNotNull(abstractProductB);
    assertTrue(abstractProductB instanceof ConcreteProductB1);
  }

  @Test
  public void testConcreteFactory2() {
    AbstractProductA abstractProductA = concreteFactory2.createProductA();
    assertNotNull(abstractProductA);
    assertTrue(abstractProductA instanceof ConcreteProductA2);
    AbstractProductB abstractProductB = concreteFactory2.createProductB();
    assertNotNull(abstractProductB);
    assertTrue(abstractProductB instanceof ConcreteProductB2);
  }

}
