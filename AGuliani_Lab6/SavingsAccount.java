
public class SavingsAccount extends BankAccount {
private double rate=0.025;
private int savingsNumber=0;
private String accountNumber;
public SavingsAccount(String name, double amount) {
	super(name, amount);
	setAccountNumber(accountNumber+"-"+savingsNumber);
}
public SavingsAccount(SavingsAccount oldAccount, double amount) {
	super(oldAccount, amount);
	savingsNumber = oldAccount.savingsNumber + 1;
	accountNumber = super.getAccountNumber()+"-"+savingsNumber;
}

public void postInterest() {
	super.deposit(getBalance()*rate);
}
public String getAccountNumber() {
	return accountNumber;
}

}