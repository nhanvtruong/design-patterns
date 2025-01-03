package behaviour.iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorPattern {

  public static void main(String[] args) {

    List<Book> list = new ArrayList<>();
    list.add(new Book(1, "Juliet and her simp", Genre.ROMANCE));
    list.add(new Book(2, "The Notepad", Genre.ROMANCE));
    list.add(new Book(3, "The Notepad++", Genre.ROMANCE));
    list.add(new Book(4, "Design Patterns", Genre.THRILLER));
    list.add(new Book(5, "C++ Programming Language", Genre.THRILLER));

    BookListIterator romanceBook = new BookListIterator(new RomanceBookIterableList(list));
    System.out.println(romanceBook.getCurrentIndex());
    System.out.println(romanceBook.current());

    System.out.println(romanceBook.next());
    System.out.println(romanceBook.getCurrentIndex());

    System.out.println(romanceBook.previous());
    System.out.println(romanceBook.getCurrentIndex());

    BookListIterator thrillerBook = new BookListIterator(new ThrillerBookIterableList(list));
    System.out.println(thrillerBook.getCurrentIndex());
    System.out.println(thrillerBook.current());

    System.out.println(thrillerBook.getCurrentIndex());
    System.out.println(thrillerBook.next());

    System.out.println(thrillerBook.getCurrentIndex());
    System.out.println(thrillerBook.previous());
  }

}
