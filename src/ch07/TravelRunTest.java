package ch07;

import java.util.ArrayList;
import java.util.Arrays;

public class TravelRunTest {
    public static void main(String[] args) {
        Company company = new Company();
        Customer c1 = new Customer(1000,"kim1", 1000);
        Customer c2 = new Customer(1001,"kim4", 1000);
        Customer c3 = new Customer(1002,"kim5", 5000);

        company.addCustomer(c1);
        company.addCustomer(c2);
        company.addCustomer(c3);

        Arrays.stream(company.getCustomers().toArray()).forEach(s-> System.out.println(s.toString()));
        company.getCustomers().stream().map(customer -> customer.getCustomerName()).forEach(s-> System.out.println(s.toString()));
        System.out.println(company.getCustomers().stream().mapToInt(customer-> customer.getMoney()).sum());
        company.getCustomers().stream().filter(customer -> customer.getCustomerId() >= 1001).forEach(s-> System.out.println(s));;
    }
}
