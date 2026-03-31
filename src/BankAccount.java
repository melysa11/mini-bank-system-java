import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String name;
    private double balance;
    private List<Transaction> transactions;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit must be > 0");
        }
        balance += amount;
        transactions.add(new Transaction(TransactionType.DEPOSIT, amount, balance));
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdraw must be > 0");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance");
        }
        balance -= amount;
        transactions.add(new Transaction(TransactionType.WITHDRAW, amount, balance));
    }
}
