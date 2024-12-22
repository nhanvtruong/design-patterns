package structural.adapter;

public class VietnameseReadable implements HumanReadable {

  private final String message;

  public VietnameseReadable(String message) {
    this.message = message + " co nghia la Toi yeu Viet Nam";
  }

  @Override
  public String getTranslatedMessage() {
    return message;
  }
}
