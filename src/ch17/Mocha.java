package ch17;

public class Mocha extends DecoratorCoffee{
    public Mocha(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.println("add mocha syrup");
    }
}
