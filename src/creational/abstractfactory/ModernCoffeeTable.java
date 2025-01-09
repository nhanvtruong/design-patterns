package creational.abstractfactory;

public class ModernCoffeeTable implements CoffeeTable {

  @Override
  public void makeCoffee() {
    System.out.println("Making coffee with coffee machine");
  }
}
