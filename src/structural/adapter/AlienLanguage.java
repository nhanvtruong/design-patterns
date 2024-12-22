package structural.adapter;

public class AlienLanguage implements CosmicLanguage {

  private final String message;

  public AlienLanguage(String message) {
    this.message = message;
  }

  @Override
  public String getCosmicMessage() {
    return message;
  }
}
