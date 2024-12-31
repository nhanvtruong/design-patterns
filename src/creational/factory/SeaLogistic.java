package creational.factory;

public class SeaLogistic extends Logistics {

  @Override
  public Transport createTransport() {
    return new ShipDelivery();
  }
}
