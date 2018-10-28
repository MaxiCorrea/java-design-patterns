package designpatterns.builder;

public class ConcreteBuilder extends Builder {

  private Product product;
  
  public ConcreteBuilder() {
    product = new Product();
  }

  @Override
  void buildPart1() {
    product.setPart1("The Part1");
  }

  @Override
  void buildPart2() {
    product.setPart2("The Part2");
  }

  Product getProduct() {
    return product;
  }
  
}
