package classes_and_objects_in_java.encapsulation;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double startingBalance) {
        this.owner = owner;
        this.balance = Math.max(startingBalance, 0);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double withdraw(double amount) {
        if (amount <= this.balance){
            this.balance = this.balance - amount;
            return amount;
        }
        return 0;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
            return amount;
        }
        return 0;
    }

}
