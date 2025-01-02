package behaviour.command;

public class Meal {

  private final String name;
  private String description;
  private final int price;
  private String status;

  public Meal(String name, int price) {
    this.name = name;
    this.price = price;
    this.status = "ORDERED";
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public String getStatus() {
    return status;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Meal{" +
        "name='" + name + '\'' +
        ", description='" + description + '\'' +
        ", price=" + price +
        ", status='" + status + '\'' +
        '}';
  }
}
