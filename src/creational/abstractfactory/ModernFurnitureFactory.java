package creational.abstractfactory;

public class ModernFurnitureFactory implements FurnitureFactory {

  @Override
  public Chair createChair() {
    return new ModernChair();
  }

  @Override
  public CoffeeTable createCoffeeTable() {
    return new ModernCoffeeTable();
  }

  @Override
  public Sofar createSofar() {
    return new ModernSofar();
  }
}
