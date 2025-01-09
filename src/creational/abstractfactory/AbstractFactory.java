package creational.abstractfactory;

public class AbstractFactory {

  public static void main(String[] args) {
    FurnitureFactory classicFurnitureFactory = new ClassicFurnitureFactory();
    Chair classicChair = classicFurnitureFactory.createChair();
    classicChair.hasLegs();
    CoffeeTable classicCoffeeTable = classicFurnitureFactory.createCoffeeTable();
    classicCoffeeTable.makeCoffee();
    Sofar classicSofar = classicFurnitureFactory.createSofar();
    classicSofar.relaxingMode();

    FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
    Chair modernChair = modernFurnitureFactory.createChair();
    modernChair.hasLegs();
    CoffeeTable modernCoffeeTable = modernFurnitureFactory.createCoffeeTable();
    modernCoffeeTable.makeCoffee();
    Sofar modernSofar = modernFurnitureFactory.createSofar();
    modernSofar.relaxingMode();
  }

}
