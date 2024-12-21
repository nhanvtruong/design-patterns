package creational.factory;

public abstract class Logistics {

  public abstract Transport createTransport();

  public void deliver() {
    Transport transport = createTransport();
    transport.deliver();
  }
}
