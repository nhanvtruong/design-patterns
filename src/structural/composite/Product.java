package structural.composite;

import java.util.Objects;

public class Product implements PaidProduct {

  private String name;
  private double price;

  public Product(String name, int price) {
    if (name == null || price < 0) {
      throw new IllegalArgumentException("Product name cannot be null or negative");
    }
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return price == product.price && Objects.equals(name, product.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, price);
  }

  @Override
  public double calculatePrice() {
    return price;
  }
}
