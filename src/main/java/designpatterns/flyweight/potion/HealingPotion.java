package designpatterns.flyweight.potion;

public class HealingPotion implements Potion {

  @Override
  public void drink() {
    System.out.println(System.identityHashCode(this));
  }

}
