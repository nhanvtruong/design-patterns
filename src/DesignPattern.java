import structural.facade.Order;
import structural.facade.PaymentService;

public class DesignPattern {

  public static void main(String[] args) {
    Order order = new Order(100, 10);
    PaymentService paymentService = new PaymentService();
    System.out.println(paymentService.proceedPayment(order));
  }

}
