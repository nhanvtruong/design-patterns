package behaviour.iterator;

import java.util.Collection;
import java.util.List;

public class ThrillerBookIterableList implements IteratorCollections {

  private final List<Book> books;

  public ThrillerBookIterableList(List<Book> books) {
    this.books = books;
  }

  @Override
  public Collection<Book> createIterator() {
    return books.stream().filter(book -> book.genre().equals(Genre.THRILLER)).toList();
  }
}
