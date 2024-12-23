package behaviour.obsever;

import java.util.Objects;

public class MobileAppAccountEventSubscriber implements AccountEventSubscriber {

  private final String mobileBankingId;

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileAppAccountEventSubscriber that = (MobileAppAccountEventSubscriber) o;
    return Objects.equals(mobileBankingId, that.mobileBankingId);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(mobileBankingId);
  }

  public MobileAppAccountEventSubscriber(String mobileBankingId) {
    this.mobileBankingId = mobileBankingId;
  }

  @Override
  public void notify(EventType eventType ,BankAccount bankAccount) {
    System.out.println("Event Type : "+ eventType.name() +",Send push-up to mobile banking user " + bankAccount.getMobileBankingId()
        + " Current Account Information: " + bankAccount);
  }
}
