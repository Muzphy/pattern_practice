package adapter.demo1;

public class ChnEuAdaptor extends ChinesePlug implements EuropeanPlugIn{
    public ChnEuAdaptor() {
    }
    //把国标插头接上欧标转换器
    @Override
    public void acceptZeroWirePlug() {
        System.out.print("EuropeanZeroWirePlugIn accepts: ");
        provideZeroWirePlug();
    }
    @Override
    public void acceptFireWirePlug() {
        System.out.print("EuropeanFireWirePlugIn accepts: ");
        provideFireWirePlug();
    }
    @Override
    public void acceptGroundWirePlug() {
        System.out.print("EuropeanGroundWirePlugIn accepts: ");
        provideGroundWirePlug();
    }
}
