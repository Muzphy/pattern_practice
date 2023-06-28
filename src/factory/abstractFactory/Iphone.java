package factory.abstractFactory;

public class Iphone implements Phone {
    public Iphone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("make Iphone!");
    }
}
