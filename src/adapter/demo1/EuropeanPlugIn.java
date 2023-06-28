package adapter.demo1;

public interface EuropeanPlugIn {
    //理解为一种规范，不局限于一个插座，所有的插座都是同一规范
    public abstract void acceptZeroWirePlug();
    public abstract void acceptFireWirePlug();
    public abstract void acceptGroundWirePlug();
}
