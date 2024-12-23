package behaviour.obsever;

import java.util.Objects;

public class SMSAccountEventSubscriber implements AccountEventSubscriber {

  @Override
  public void notify(EventType eventType, BankAccount bankAccount) {
    System.out.println(
        "Event type : " + eventType.name() + ",Send SMS Notification to " + bankAccount.getPhoneNo()
            + " Current Account Information: " + bankAccount);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SMSAccountEventSubscriber that = (SMSAccountEventSubscriber) o;
    return Objects.equals(phoneNo, that.phoneNo);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(phoneNo);
  }

  private final String phoneNo;

  public SMSAccountEventSubscriber(String phoneNo) {
    this.phoneNo = phoneNo;
  }
}
