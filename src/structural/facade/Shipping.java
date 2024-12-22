package structural.facade;

public class Shipping {

  private final double distanceInKilometers;

  private double shippingCost;

  public Shipping(double distanceInKilometers) {
    this.distanceInKilometers = distanceInKilometers;
  }

  public double getShippingCost() {
    if(distanceInKilometers > 10) {
      return shippingCost * 1.2;
    }
    return shippingCost;
  }
}
