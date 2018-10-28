package designpatterns.bridge.shapecolor;

import static org.junit.Assert.assertSame;
import org.junit.Test;

public class ShapeTest implements Color {
  
  @Test
  public final void testBridge() {
    Shape shape = new Shape(this) {
      @Override
      public void applyColor() {}
    };
    assertSame(this , shape.getColor());
  }

  @Override
  public void apply() {}

}
