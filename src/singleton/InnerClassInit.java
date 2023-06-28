package singleton;

public class InnerClassInit {

    private InnerClassInit(){

    }

    public static InnerClassInit getInstance(){
        return InnerClass.instance;
    }

    public static class InnerClass{
        private static final InnerClassInit instance = new InnerClassInit();
    }


}
