package structural.adapter;

public class EnglishReadable implements HumanReadable {

  private final String message;

  public EnglishReadable(String message) {
    this.message = message + " means Yo mama is fat";
  }

  @Override
  public String getTranslatedMessage() {
    return message;
  }
}
