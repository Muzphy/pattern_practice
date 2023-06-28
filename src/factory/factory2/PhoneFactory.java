package factory.factory2;

public class PhoneFactory {
    public Phone makePone(String brand){
        if(brand.equals("MiPhone")){
            return new Miphone();
        }else if(brand.equals("Iphone")){
            return new Iphone();
        }
        return null;
    }
}
