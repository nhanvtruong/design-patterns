package structural.facade;

public class Tax {

  private final double taxRate = 0.05;

  private double taxAmount;

  public Tax(double taxAmount) {
    this.taxAmount += taxAmount * taxRate;
  }

  public double getTaxAmount() {
    return taxAmount;
  }

}
