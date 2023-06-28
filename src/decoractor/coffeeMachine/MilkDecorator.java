package decoractor.coffeeMachine;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(ICoffee coffee) {

        super(coffee);
    }
    @Override
    public void makeCoffee() {
        System.out.println("MilkDecorator.makeCoffee");
        super.makeCoffee();
        addMilk();
    }
    private void addMilk(){
        System.out.println("MilkDecorator.addMilk");
        System.out.print("加奶 ");
    }
}
