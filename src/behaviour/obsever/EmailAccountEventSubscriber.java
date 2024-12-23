package behaviour.obsever;

import java.util.Objects;

public class EmailAccountEventSubscriber implements AccountEventSubscriber {

  private final String email;

  public EmailAccountEventSubscriber(String email) {
    this.email = email;
  }

  @Override
  public void notify(EventType eventType ,BankAccount bankAccount) {
    System.out.println( "Event Type: "+ eventType.name() +", Send Email Notification to " + bankAccount.getEmail()
        + " Current Account Information: " + bankAccount);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailAccountEventSubscriber that = (EmailAccountEventSubscriber) o;
    return Objects.equals(email, that.email);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(email);
  }
}
