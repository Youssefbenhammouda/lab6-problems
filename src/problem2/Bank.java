package problem2;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5);

    public Bank(String bankName){
        name = bankName;
    }


    public boolean addTransaction(Customer customer, double amount){

        addCustomer(customer);

        return customer.addTransaction(amount);


    }

    public boolean addCustomer(Customer customer){
        int i = customers.indexOf(customer);
        if(i<0) {

                customers.add(customer); return true;

        }
        else return false;
    }

    public void printStatement(Customer customer){
        System.out.printf("Customer: %s%n - Transactions:%n",customer.getName());

        for(Double amount:customer.getTransactions()){

            System.out.printf("\t%+f%n",amount);
        }

        System.out.printf(" - Balance: %f%n",customer.getBalance());


    }



}
