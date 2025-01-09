package creational.abstractfactory;

public class ClassicChair implements Chair {

  @Override
  public void hasLegs() {
    System.out.println("Classic Chair has 4 legs");
  }
}
