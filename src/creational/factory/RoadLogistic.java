package creational.factory;

public class RoadLogistic extends Logistics {

  @Override
  public Transport createTransport() {
    return new TruckDelivery();
  }
}
