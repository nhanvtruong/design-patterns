package creational.factory;

public class TruckDelivery implements Transport{

  @Override
  public void deliver() {
    System.out.println("Delivered by truck");
  }
}
