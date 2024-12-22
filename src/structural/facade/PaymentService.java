package structural.facade;

public class PaymentService {

  // Assume that we have 3 services that contain very complicated logic that run well now ,
  // so we don't need to know behind the scene, just invoke their method and it will be fine
  public double proceedPayment(Order order) {
    // Apply Discount
    Discount discount = new Discount(order.price());
    discount.applyVoucher(0.1);
    double totalAmount = discount.getPrice();

    // Calculate shipping Fee
    Shipping shipping = new Shipping(order.distance());
    totalAmount += shipping.getShippingCost();

    // apply tax
    Tax tax = new Tax(order.price());
    totalAmount += tax.getTaxAmount();
    return totalAmount;
  }
}
