package behaviour.command;

import java.util.logging.Logger;

public class Chef {

  private final static Logger log = Logger.getLogger(Chef.class.getName());

  private OrderMeal orderMeal;

  public Meal cookTheMeal() throws InterruptedException {
    return orderMeal.makeOrder();
  }

  public void receiveMealOrder(OrderMeal orderMeal) {
    log.info(String.format("Receive meal order: %s", orderMeal.meal()));
    this.orderMeal = orderMeal;
  }
}
