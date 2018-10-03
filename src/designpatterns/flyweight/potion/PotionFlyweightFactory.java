package designpatterns.flyweight.potion;

import java.util.EnumMap;
import java.util.Map;

public class PotionFlyweightFactory {

  private final Map<PotionType, Potion> pool;

  public PotionFlyweightFactory() {
    pool = new EnumMap<>(PotionType.class);
  }
  
  public Potion getPotion(PotionType type) {
    Potion potion = pool.get(type);
    if (potion == null) {
      switch (type) {
        case HEALING: {
          potion = new HealingPotion();
          pool.put(type , potion);
          break;
        }
        case HOLYWATER: {
          potion = new HolyWaterPotion();
          pool.put(type , potion);
          break;
        }
        case INVISIBILITY: {
          potion = new InvisibilityPotion();
          pool.put(type , potion);
          break;
        }
        default:
          break;
      }
    }
    return potion;
  }

}
