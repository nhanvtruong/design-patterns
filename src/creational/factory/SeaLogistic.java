package creational.factory;

public class SeaLogistic extends Logistics {

  private Transport transport;

  @Override
  public Transport createTransport() {
    transport = new ShipDelivery();
    return transport;
  }
}
