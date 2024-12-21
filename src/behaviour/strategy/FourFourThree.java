package behaviour.strategy;

public class FourFourThree implements Formula {

  @Override
  public void attack() {
    System.out.println("Attacking with 4-4-3" );
  }

  @Override
  public void defense() {
    System.out.println("Defending with 4-5-1" );
  }
}
