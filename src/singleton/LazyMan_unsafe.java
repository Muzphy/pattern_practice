package singleton;
//私有化构造方法：确保单例类不能被其他类实例化。
//静态私有成员变量：用于保存单例类的唯一实例。
//静态公有方法：用于返回单例类的唯一实例。
public class LazyMan_unsafe {
    //私有化构造方法：确保单例类不能被其他类实例化。
    private LazyMan_unsafe(){
        System.out.println("I am called by " + this.toString() + " "+Thread.currentThread().getName());
    }
    //静态私有成员变量：用于保存单例类的唯一实例。
    private static LazyMan_unsafe instance;
    //静态公有方法：用于返回单例类的唯一实例(静态成员变量)。
    public static LazyMan_unsafe getInstance(){
        if(instance == null){
            instance = new LazyMan_unsafe();
        }
        return instance;
    }
    public void printInfo(){
        System.out.println(this.toString());
    }

}
