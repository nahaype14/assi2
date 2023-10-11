public class ChocolateDecorator extends CondimentDecorator {
    Coffee coffee;

    public ChocolateDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Chocolate";
    }

    public double cost() {
        return coffee.cost() + 1.5;
    }
}