package behaviour.command;

import java.util.logging.Logger;

public class Waiter {

  private static final Logger log = Logger.getLogger(Waiter.class.getName());

  private OrderMeal orderMeal;

  private Meal meal;

  public Meal serveTheMeal() {
    return meal;
  }

  public void pickMealFromChef(Meal meal) {
    log.info("Picking meal from chef");
    this.meal = meal;
  }

  public void takeOrderFromCustomer(OrderMeal orderMeal) {
    log.info("Waiter : Taking order from customer ");
    this.orderMeal = orderMeal;
  }

  public OrderMeal giveMealOrderToChef() {
    log.info("Waiter : Giving order to chef");
    return orderMeal;
  }
}
