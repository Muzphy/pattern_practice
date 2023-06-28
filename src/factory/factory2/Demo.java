package factory.factory2;

public class Demo {
    public static void main(String[] args) {
        PhoneFactory pf = new PhoneFactory();
        Phone miPhone = pf.makePone("MiPhone");
        pf.makePone("Iphone");
    }
}
