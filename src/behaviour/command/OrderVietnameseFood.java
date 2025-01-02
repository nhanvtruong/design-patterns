package behaviour.command;

public record OrderVietnameseFood(Meal meal) implements OrderMeal {

  @Override
  public Meal makeOrder() throws InterruptedException {
    log.info("Sure , I am cooking some delicious Pho Bo");
    Thread.sleep(2000);
    meal.setStatus("DONE");
    return meal;
  }
}
