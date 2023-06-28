package singleton;

public class HungryMan {
    // 在类加载时就创建并初始化单例对象
    private static HungryMan instance = new HungryMan();
    // 私有化构造方法，避免被其他类实例化
    private HungryMan(){
        System.out.println("I am called by " + this.toString() + " "+Thread.currentThread().getName());
    }
    // 提供静态方法返回单例对象
    // 单例对象需要在整个应用程序周期内保持唯一性，而静态方法可以直接通过类名调用，不需要先实例化对象
    public static HungryMan getInstance(){
//        instance = new HungryMan();
        return instance;
    }
}
