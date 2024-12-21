package creational.factory;

public class ShipDelivery implements Transport{

  @Override
  public void deliver() {
    System.out.println("Delivered by ship");
  }
}
