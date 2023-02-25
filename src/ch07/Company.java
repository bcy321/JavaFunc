package ch07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Company {
    private ArrayList<Customer> customers;

    public Company() {
        customers = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer){
        System.out.println("/////////Customer Add///////////////");
        customers.add(customer);
        System.out.println("/////////Customer Add///////////////");
    }

    public boolean removeCustomer(int customerId){
        if (customers.isEmpty()) {
            System.out.println("현재 여행사 고객은 없습니다.");
            return false;
        }
        else {
            Iterator<Customer> customerIterator = customers.iterator();
            while (customerIterator.hasNext()){
                Customer customer = customerIterator.next();
                if (customer.getCustomerId() == customerId){
                    System.out.println("/////////Customer Remove///////////////");
                    customers.remove(customer);
                    System.out.println("/////////Customer Remove///////////////");
                    return true;
                }
            }
        }
        return false;
    }
}
