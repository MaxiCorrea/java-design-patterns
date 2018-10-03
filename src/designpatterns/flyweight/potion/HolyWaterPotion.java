package designpatterns.flyweight.potion;

public class HolyWaterPotion implements Potion {

  @Override
  public void drink() {
    System.out.println(System.identityHashCode(this));
  }

}
