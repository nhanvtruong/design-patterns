package creational.singleton;

public class CpuCoreTwo {

  public void countDown(){
    GlobalCounter globalCounter = GlobalCounter.getInstance();
    globalCounter.decrement();
    System.out.println("Current counter value " + globalCounter.getCounter());
  }

}
