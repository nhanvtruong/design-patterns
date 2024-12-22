package structural.facade;

public class Discount {

  private double price;

  public Discount(double price) {
    this.price = price;
  }

  public void applyVoucher(double discount) {
    if (discount > 1) {
      throw new RuntimeException("No such discount");
    }
    double discountPrice = discount * price;
    this.price = price - discountPrice;
  }

  public double getPrice() {
    return price;
  }
}
