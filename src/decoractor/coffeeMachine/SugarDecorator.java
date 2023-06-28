package decoractor.coffeeMachine;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(ICoffee coffee) {
        super(coffee);
    }
    @Override
    public void makeCoffee() {
        System.out.println("SugarDecorator.makeCoffee");
        super.makeCoffee();
        addSugar();
    }
    private void addSugar(){
        System.out.println("SugarDecorator.addSugar");
        System.out.print("加糖");
    }
}
