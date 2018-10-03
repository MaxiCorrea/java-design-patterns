package designpatterns.flyweight.potion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class PotionFlyweightFactoryTest {
  
  @Test
  public void testHeadingShared() {
    PotionFlyweightFactory factory = new PotionFlyweightFactory();
    Potion potion1 = factory.getPotion(PotionType.HEALING);
    Potion potion2 = factory.getPotion(PotionType.HEALING);
    assertNotNull(potion1);
    assertNotNull(potion2);
    assertEquals(potion1.hashCode() , potion2.hashCode());
  }
  
  @Test
  public void testHolywaterShared() {
    PotionFlyweightFactory factory = new PotionFlyweightFactory();
    Potion potion1 = factory.getPotion(PotionType.HOLYWATER);
    Potion potion2 = factory.getPotion(PotionType.HOLYWATER);
    assertNotNull(potion1);
    assertNotNull(potion2);
    assertEquals(potion1.hashCode() , potion2.hashCode());
  }

  @Test
  public void testInvisibilityShared() {
    PotionFlyweightFactory factory = new PotionFlyweightFactory();
    Potion potion1 = factory.getPotion(PotionType.INVISIBILITY);
    Potion potion2 = factory.getPotion(PotionType.INVISIBILITY);
    assertNotNull(potion1);
    assertNotNull(potion2);
    assertEquals(potion1.hashCode() , potion2.hashCode());
  }

}
