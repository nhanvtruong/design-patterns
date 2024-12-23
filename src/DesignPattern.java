import behaviour.obsever.AccountEventManager;
import behaviour.obsever.BankAccount;
import behaviour.obsever.EmailAccountEventSubscriber;
import behaviour.obsever.EventType;
import behaviour.obsever.MobileAppAccountEventSubscriber;
import behaviour.obsever.SMSAccountEventSubscriber;

public class DesignPattern {

  public static void main(String[] args) {

    BankAccount bankAccount = new BankAccount(
        "USER123",
        "091234565",
        "user@gmail.com",
        12345667
    );

    EmailAccountEventSubscriber emailSubscriber = new EmailAccountEventSubscriber(
        bankAccount.getEmail());
    SMSAccountEventSubscriber smsSubscriber = new SMSAccountEventSubscriber(
        bankAccount.getPhoneNo());
    MobileAppAccountEventSubscriber mobileSubscriber = new MobileAppAccountEventSubscriber(
        bankAccount.getPhoneNo());

    AccountEventManager accountEventManager = bankAccount.getAccountEventManager();
    accountEventManager.addSubscriber(EventType.CREDIT, emailSubscriber);
    accountEventManager.addSubscriber(EventType.CREDIT, smsSubscriber);
    accountEventManager.addSubscriber(EventType.DEBIT, mobileSubscriber);

    bankAccount.deposit(100.0);
    bankAccount.withdraw(20.0);

    accountEventManager.removeSubscriber(EventType.CREDIT, smsSubscriber);
    bankAccount.deposit(200.0);

  }

}
