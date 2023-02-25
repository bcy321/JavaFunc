package ch07;

public class Customer {
    private int customerId;
    private String customerName;
    private int money;

    public Customer(int customerId, String customerName, int money) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.money = money;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return customerId + " " + customerName + " " + money;
    }
}
