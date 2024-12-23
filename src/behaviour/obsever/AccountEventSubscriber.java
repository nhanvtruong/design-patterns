package behaviour.obsever;

public interface AccountEventSubscriber {

  void notify(EventType eventType, BankAccount bankAccount);

  int hashCode();

  boolean equals(Object obj);

}
