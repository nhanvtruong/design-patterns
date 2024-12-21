package behaviour.strategy;

public class FootballMatch {

  public FootballMatch(Formula formula) {
    this.formula = formula;
  }

  private final Formula formula;

  public void attack(){
    formula.attack();
  }

  public void defend(){
    formula.defense();
  }
}
