package creational.abstractfactory;

public class ModernChair implements Chair {

  @Override
  public void hasLegs() {
    System.out.println("Modern Chair has 2 legs, can spread them too =)");
  }
}
