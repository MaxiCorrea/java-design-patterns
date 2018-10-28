package designpatterns.adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumerationAdapter<E> implements Enumeration<E> {

  private final Iterator<E> iterator;

  public IteratorEnumerationAdapter(Iterator<E> iterator) {
    this.iterator = iterator;
  }

  @Override
  public boolean hasMoreElements() {
    return iterator.hasNext();
  }

  @Override
  public E nextElement() {
    return iterator.next();
  }

}
