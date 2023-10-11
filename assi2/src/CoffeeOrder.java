public class CoffeeOrder {
    public static void main(String[] args) {
        Coffee order1 = new Espresso();
        System.out.println("Coffee: " + order1.getDescription());
        System.out.println("Cost: $" + order1.cost());

        Coffee order2 = new MilkDecorator(new Latte());
        System.out.println("Coffee: " + order2.getDescription());
        System.out.println("Cost: $" + order2.cost());

        Coffee order3 = new ChocolateDecorator(new SugarDecorator(new Cappuccino()));
        System.out.println("Coffee: " + order3.getDescription());
        System.out.println("Cost: $" + order3.cost());
    }
}