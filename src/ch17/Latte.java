package ch17;

public class Latte extends DecoratorCoffee{
    public Latte(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.println(" Add Milk ");
    }
}
