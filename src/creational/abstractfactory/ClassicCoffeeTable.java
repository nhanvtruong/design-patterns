package creational.abstractfactory;

public class ClassicCoffeeTable implements CoffeeTable {

  @Override
  public void makeCoffee() {
    System.out.println("Making coffee with classic coffee");
  }
}
