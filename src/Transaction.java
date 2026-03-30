public class Transaction {
    private TransactionType type;
    private double amount;
    private double balanceAfter;

    public Transaction(TransactionType type, double amount, double balanceAfter) {
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
    }

    public TransactionType getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalanceAfter() {
        return balanceAfter;
    }

    @Override
    public String toString() {
        return "Type: " + type +
               " | Amount: " + amount +
               " | Balance After: " + balanceAfter;
    }
} 