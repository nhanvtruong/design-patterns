package behaviour.obsever;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class AccountEventManager {

  public AccountEventManager() {
    this.subscribers = new EnumMap<>(EventType.class);
  }

  private final Map<EventType, Set<AccountEventSubscriber>> subscribers;

  public void addSubscriber(EventType type, AccountEventSubscriber accountEventSubscriber) {
    subscribers.computeIfAbsent(type, k -> new HashSet<>())
        .add(accountEventSubscriber);
  }

  public void removeSubscriber(EventType type, AccountEventSubscriber accountEventSubscriber) {
    Set<AccountEventSubscriber> accountEventSubscribers = Optional.ofNullable(subscribers.get(type))
        .orElseThrow(
            () -> new IllegalArgumentException("No AccountEventSubscriber found for type " + type));
    accountEventSubscribers.remove(accountEventSubscriber);
  }

  void notifySubscribers(EventType type, BankAccount account) {
    Set<AccountEventSubscriber> accountEventSubscribers = Optional.ofNullable(subscribers.get(type))
        .orElseThrow(
            () -> new IllegalArgumentException("No AccountEventSubscriber found for type " + type));
    accountEventSubscribers.forEach(
        accountEventSubscriber -> accountEventSubscriber.notify(type, account));

  }

}
