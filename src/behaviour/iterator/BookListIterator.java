package behaviour.iterator;

import java.util.List;

public class BookListIterator implements IteratorBuddy<Book> {

  private int currentIndex;

  private final List<Book> bookList;

  private final IteratorCollections iteratorCollections;

  public BookListIterator(IteratorCollections iteratorCollections) {
    this.currentIndex = 0;
    this.iteratorCollections = iteratorCollections;
    bookList = (List<Book>) iteratorCollections.createIterator();
  }

  @Override
  public boolean hasNext() {
    return currentIndex + 1 < bookList.size();
  }

  @Override
  public boolean hasPrevious() {
    return currentIndex > 0;
  }

  @Override
  public Book next() {
    return hasNext() ? bookList.get(++currentIndex) : null;
  }

  @Override
  public Book current() {
    return bookList.get(currentIndex);
  }

  @Override
  public Book previous() {
    return hasPrevious() ? bookList.get(--currentIndex) : null;
  }

  public int getCurrentIndex() {
    return currentIndex;
  }

  public List<Book> getBookList() {
    return bookList;
  }

  public IteratorCollections getIteratorCollections() {
    return iteratorCollections;
  }
}
