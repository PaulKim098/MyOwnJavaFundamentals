package classes_and_objects_in_java.encapsulation;

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Jerry", 5000);

        bankAccount.withdraw(500);
        bankAccount.deposit(5000);
        bankAccount.withdraw(2000);

        System.out.println(bankAccount.getOwner());
        System.out.println(bankAccount.getBalance());

    }
}
