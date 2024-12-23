import creational.singleton.GlobalCounter;

public class DesignPattern {

  public static void main(String[] args) {

    Thread t1 = new Thread(() -> {
      GlobalCounter globalCounter = GlobalCounter.getInstance();
      globalCounter.increment();
      System.out.println("Counter value : " +globalCounter.getCounter());
    });

    Thread t2 = new Thread(() -> {
      GlobalCounter globalCounter = GlobalCounter.getInstance();
      globalCounter.increment();
      System.out.println("Counter value : " +globalCounter.getCounter());
    });

    t1.start();
    t2.start();

  }

}
