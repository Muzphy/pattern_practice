package decoractor.coffeeMachine;

public class OriginalCoffee implements ICoffee{
    @Override
    public void makeCoffee() {
        System.out.print("原味咖啡 ");
    }
}
