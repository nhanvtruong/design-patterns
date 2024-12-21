package creational.factory;

public class RoadLogistic extends Logistics {

  private Transport transport;

  @Override
  public Transport createTransport() {
    transport = new TruckDelivery();
    return transport;
  }
}
