package behaviour.command;

import java.util.logging.Logger;

public interface OrderMeal {

  Meal makeOrder() throws InterruptedException;

  Meal meal();

  Logger log = Logger.getLogger(OrderMeal.class.getName());
}
