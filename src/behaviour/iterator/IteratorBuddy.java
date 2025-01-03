package behaviour.iterator;

public interface IteratorBuddy<T> {

  boolean hasNext();

  boolean hasPrevious();

  T next();

  T current();

  T previous();

}
