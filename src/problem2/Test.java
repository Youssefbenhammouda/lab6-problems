package problem2;

public class Test {

    public static void main(String[] args) {
        Bank bank = new Bank("Bank Populaire");

        Customer youssef = new Customer("Youssef");
        Customer Adam = new Customer("Adam");

        // 1. Adding customers
        System.out.println(bank.addCustomer(youssef));
        System.out.println(bank.addCustomer(youssef));
        System.out.println(bank.addCustomer(Adam));


        bank.addTransaction(youssef, 500.0);    // credit
        bank.addTransaction(youssef, -120.5);   // debit
        bank.addTransaction(Adam, 1000.0);     // credit
        bank.addTransaction(Adam, -250.0);     // debit


        // 4. Print statements
        bank.printStatement(youssef);
        bank.printStatement(Adam);

    }
}
