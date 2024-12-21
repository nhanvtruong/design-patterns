package creational.singleton;

public class GlobalCounter {

  private static GlobalCounter instance;

  private int counter = 0;

  public static GlobalCounter getInstance() {
    if (instance == null) {
      instance = new GlobalCounter();
    }
    return instance;
  }

  private GlobalCounter() {
  }

  public void increment() {
    counter++;
  }

  public void decrement() {
    counter--;
  }

  public int getCounter() {
    return counter;
  }

}
