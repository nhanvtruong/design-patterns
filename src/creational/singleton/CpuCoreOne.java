package creational.singleton;

public class CpuCoreOne {

  public void countUp(){
    GlobalCounter globalCounter = GlobalCounter.getInstance();
    globalCounter.increment();
    System.out.println("Current counter value " + globalCounter.getCounter());
  }

}
