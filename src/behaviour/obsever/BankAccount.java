package behaviour.obsever;

public class BankAccount {

  private final String mobileBankingId;
  private final String phoneNo;
  private final String email;
  private final int accountNumber;
  private double balance;

  private final AccountEventManager accountEventManager;

  public BankAccount(String mobileBankingId, String phoneNo, String email, int accountNumber) {
    this.mobileBankingId = mobileBankingId;
    this.phoneNo = phoneNo;
    this.email = email;
    this.accountNumber = accountNumber;
    this.balance = 0;
    this.accountEventManager = new AccountEventManager();
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void deposit(double amount) {
    if (amount <= 0) {
      throw new RuntimeException("Invalid Deposit Amount");
    }
    this.balance += amount;
    accountEventManager.notifySubscribers(EventType.CREDIT, this);
  }

  public void withdraw(double amount) {
    if (amount > this.balance || amount < 0) {
      throw new RuntimeException("Invalid Withdrawal Amount");
    }
    this.balance -= amount;
    accountEventManager.notifySubscribers(EventType.DEBIT, this);
  }

  public String getMobileBankingId() {
    return mobileBankingId;
  }

  public String getPhoneNo() {
    return phoneNo;
  }

  public String getEmail() {
    return email;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public AccountEventManager getAccountEventManager() {
    return accountEventManager;
  }

  @Override
  public String toString() {
    return "BankAccount{" +
        "balance=" + balance +
        ", accountNumber=" + accountNumber +
        '}';
  }
}
