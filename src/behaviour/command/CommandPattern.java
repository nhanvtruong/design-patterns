package behaviour.command;

public class CommandPattern {

  public static void main(String[] args) throws InterruptedException {
    Customer customer = new Customer("Nhan Truong");
    Waiter waiter = new Waiter();
    Chef chef = new Chef();

    customer.makeOrder(new OrderKoreanFood(new Meal("Korean Kimbap", 100)));
    waiter.takeOrderFromCustomer(customer.getMealOrder());

    chef.receiveMealOrder(waiter.giveMealOrderToChef());
    Meal meal = chef.cookTheMeal();

    waiter.pickMealFromChef(meal);

    customer.receiveTheMeal(waiter.serveTheMeal());
    customer.haveMeal();
  }

}
