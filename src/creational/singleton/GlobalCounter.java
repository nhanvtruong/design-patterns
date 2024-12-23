package creational.singleton;

public class GlobalCounter {

  private int counter = 0;

  private static final class InstanceHolder {
    private static final GlobalCounter instance = new GlobalCounter();
  }

  public static GlobalCounter getInstance() {
    return InstanceHolder.instance;
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
