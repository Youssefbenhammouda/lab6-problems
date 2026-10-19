package problem2;

import java.util.ArrayList;

public class Customer {
    private String name;

    private ArrayList<Double> transactions = new ArrayList<>(20);

    private double balance = 0.0;

    public Customer(String customerName){
        name = customerName;
    }

    protected boolean addTransaction(double amount){
        if(balance + amount <0.0)return false;
        balance += amount;
        transactions.add(amount);

        return  true;

    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Double> getTransactions() {
        return new ArrayList<>(transactions);
    }

    @Override
    public String toString(){
        return String.format("<Customer name='%s' balance=%f nOfTransactions=%d>",name,balance,transactions.size());
    }

    public String getName() {
        return name;
    }
}
