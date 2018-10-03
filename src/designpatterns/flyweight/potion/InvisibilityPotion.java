package designpatterns.flyweight.potion;

public class InvisibilityPotion implements Potion {

  @Override
  public void drink() {
    System.out.println(System.identityHashCode(this));
  }

}
