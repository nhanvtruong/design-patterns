import behaviour.command.Chef;
import behaviour.command.Customer;
import behaviour.command.OrderKoreanFood;
import behaviour.command.Meal;
import behaviour.command.Waiter;

public class DesignPattern {

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
