package designpatterns.builder;

public abstract class Builder {

  abstract void buildPart1();
  
  abstract void buildPart2();
  
  abstract Product build();
  
}
