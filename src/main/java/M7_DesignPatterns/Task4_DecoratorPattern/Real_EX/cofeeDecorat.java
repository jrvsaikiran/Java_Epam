package M7_DesignPatterns.Task4_DecoratorPattern.Real_EX;

// Step 1: Create the Component interface
interface Coffee {
    String getDescription();
    double getCost();
}
// Step 2: Create the Concrete Component class
class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Simple coffee";
    }
    public double getCost() {
        return 5.0;
    }
}
// Step 3: Create the Decorator class
abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}
// Step 4: Create Concrete Decorators
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", milk";
    }
    public double getCost() {
        return decoratedCoffee.getCost() + 1.5;
    }
}
class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", sugar";
    }
    public double getCost() {
        return decoratedCoffee.getCost() + 0.5;
    }
}
// Step 5: Use the decorators
class DecoratCoffe {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
    }
}