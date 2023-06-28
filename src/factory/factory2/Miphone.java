package factory.factory2;

public class Miphone implements Phone{
    public Miphone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("make Miphone!");
    }
}
