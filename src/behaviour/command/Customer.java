package behaviour.command;

import java.util.logging.Logger;

public class Customer {

  private static final Logger log = Logger.getLogger(Customer.class.getName());

  private final String name;

  private Meal meal;

  private OrderMeal orderMeal;

  public void makeOrder(OrderMeal order) {
    log.info("Ok let me look into the menu");
    orderMeal = order;
  }

  public String getName() {
    return name;
  }

  public Customer(String name) {
    this.name = name;
  }

  public Meal haveMeal() {
    log.info(String.format("Thanks . It's time for having delicious %s ", meal));
    return meal;
  }

  public void receiveTheMeal(Meal meal) {
    log.info(String.format("Great , the meal is %s", meal.getStatus()));
    this.meal = meal;
  }

  public OrderMeal getMealOrder() {
    return orderMeal;
  }
}
