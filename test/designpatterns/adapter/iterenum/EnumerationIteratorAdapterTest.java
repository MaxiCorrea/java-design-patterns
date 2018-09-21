package designpatterns.adapter.iterenum;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import org.junit.Test;

public class EnumerationIteratorAdapterTest {

  private static final String[] ELEMENTS = {"A","B","C","D"};
  
  @Test
  public void testAdapter() {
    Vector<String> vector = new Vector<>(Arrays.asList(ELEMENTS));
    Enumeration<String> enumeration = vector.elements();
    Iterator<String> iterator = new EnumerationIteratorAdapter<>(enumeration);
    int i = 0;
    while(iterator.hasNext()) {
      assertEquals(ELEMENTS[i++] , iterator.next());
    }
  }

}
