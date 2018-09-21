package designpatterns.adapter.iterenum;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;

public class IteratorEnumerationAdapterTest {

  private static final String[] ELEMENTS = {"A", "B", "C", "D"};

  @Test
  public void testAdapter() {
    List<String> list = Arrays.asList(ELEMENTS);
    Iterator<String> iterator = list.iterator();
    Enumeration<String> enumeration = new IteratorEnumerationAdapter<>(iterator);

    int i = 0;
    while (enumeration.hasMoreElements()) {
      assertEquals(ELEMENTS[i++], enumeration.nextElement());
    }
  }

}
