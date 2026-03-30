public class BankService {

private BankAccount

account;

public BankService() { account = new

BankAccount();

}

public void deposit(double amount) throws InvalidAmountException {

account.deposit(amount);

public void

withdraw(double amount)

throws

ceException

InvalidAmountException,

InsufficientE

{