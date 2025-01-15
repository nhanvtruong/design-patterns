package structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Box implements PaidProduct {

  private static final Logger log = Logger.getLogger(Box.class.getName());

  protected final double width;
  protected final double height;
  protected double totalPrice;
  protected double packagingPrice;

  protected final List<PaidProduct> products;

  public Box(double width, double height) {
    if (width <= 0 || height <= 0) {
      throw new IllegalArgumentException("width and height must be greater than 0");
    }
    this.width = width;
    this.height = height;
    totalPrice = 0.0;
    packagingPrice = 0.0;
    products = new ArrayList<>();
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public List<PaidProduct> getProducts() {
    return products;
  }

  public void removeProduct(PaidProduct product) {
    if (product != null) {
      products.remove(product);
    }
  }

  public void addProduct(PaidProduct product) {
    if (product != null) {
      products.add(product);
    }
  }

  @Override
  public double getPrice() {
    return totalPrice;
  }

  public void setPackagingPrice(double rate) {
    if (rate <= 0 || rate >= 1) {
      throw new IllegalArgumentException("rate must be greater than 0 and less than 1");
    }
    this.packagingPrice = products.size() * rate;
  }

  @Override
  public double calculatePrice() {
    totalPrice = products.stream()
        .mapToDouble(PaidProduct::getPrice).sum();
    log.info("Product price: " + totalPrice);
    log.info("Packaging price: " + packagingPrice);
    totalPrice += packagingPrice;
    log.info("Total price: " + totalPrice);
    return totalPrice;
  }
}
