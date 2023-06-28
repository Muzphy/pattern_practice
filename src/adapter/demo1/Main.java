package adapter.demo1;

public class Main {
    public static void main(String[] args) {
        //转换插头在手，无视国标插头的存在
        EuropeanPlugIn epi = new ChnEuAdaptor();
        //直接把转换器插插座里
        epi.acceptZeroWirePlug();
        epi.acceptFireWirePlug();
        epi.acceptGroundWirePlug();
    }
}
