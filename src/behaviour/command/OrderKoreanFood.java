package behaviour.command;


public record OrderKoreanFood(Meal meal) implements OrderMeal {

  @Override
  public Meal makeOrder() throws InterruptedException {
    log.info("Okay . Let me cook , bro");
    Thread.sleep(1000);
    meal.setStatus("DONE");
    return meal;
  }
}
