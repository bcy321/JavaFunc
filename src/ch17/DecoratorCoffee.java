package ch17;

public abstract class DecoratorCoffee extends Coffee{

    Coffee coffee;
    public DecoratorCoffee(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
    }
}
