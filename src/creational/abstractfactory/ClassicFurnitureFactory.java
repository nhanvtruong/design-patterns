package creational.abstractfactory;

public class ClassicFurnitureFactory implements FurnitureFactory {

  @Override
  public Chair createChair() {
    return new ClassicChair();
  }

  @Override
  public CoffeeTable createCoffeeTable() {
    return new ClassicCoffeeTable();
  }

  @Override
  public Sofar createSofar() {
    return new ClassicSofar();
  }
}
