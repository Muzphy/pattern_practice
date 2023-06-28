package singleton;

public class LazyMan_safe {

    private LazyMan_safe(){
        System.out.println("I am called by " + this.toString() + " "+Thread.currentThread().getName());
    };

    private static LazyMan_safe instance;
    //强制synchronized保证同步，只会返回一个实例
    public static synchronized LazyMan_safe getInstance(){
        if(instance == null){
            instance = new LazyMan_safe();
        }
        return  instance;
    }
}
