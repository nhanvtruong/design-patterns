package behaviour.strategy;

public class DiamondMidField implements Formula {

  @Override
  public void attack() {
    System.out.println("Attacking with DiamondMidField 4-2-3-1");
  }

  @Override
  public void defense() {
    System.out.println("Defensing with DiamondMidField 5-2-3");
  }
}
