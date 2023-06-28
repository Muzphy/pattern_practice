package decoractor.coffeeMachine;

public class Test {
    public static void main(String[] args) {
        //原味咖啡
        ICoffee coffee=new OriginalCoffee();
        coffee.makeCoffee();

        System.out.println("");

        //加奶的咖啡
        //当你需要加奶咖啡时，仅仅需要将原味咖啡对象传递到加奶装饰者中去装饰一下就好了
        //关键在于coffee对象是OriginalCoffee
        coffee=new MilkDecorator(coffee);
        //调用makeCoffee的时候，调用了父类的调用makeCoffee的时候，相当于套了一层
        coffee.makeCoffee();

        System.out.println("");

        //先加奶后加糖的咖啡
        //还想加糖，那就把加了奶的咖啡对象丢到加糖装饰者类中去装饰一下
        coffee=new SugarDecorator(coffee);
        coffee.makeCoffee();
    }
}
