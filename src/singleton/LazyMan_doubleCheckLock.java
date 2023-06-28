package singleton;
//线程安全的懒汉模式在获取实例时使用synchronized关键字进行同步，这会导致性能问题，因为每次获取实例时都需要获取锁。
//DCL的懒汉模式则是在获取实例时使用双重检查锁定，可以避免每次都获取锁，提高了性能。
//但是需要注意的是，在Java 5之前，由于JVM的内存模型问题，DCL的实现可能会出现问题，因此需要使用volatile关键字来保证内存可见性。
public class LazyMan_doubleCheckLock {

    private LazyMan_doubleCheckLock(){
        System.out.println("I am called by " + this.toString() + " "+Thread.currentThread().getName());
    }

    private volatile static LazyMan_doubleCheckLock instance;

    public static LazyMan_doubleCheckLock getInstance(){
        if(instance == null){//第一次判断是因为加锁之前可能会被两个线程拿到
            synchronized (LazyMan_doubleCheckLock.class){//锁当前对象，保证只有一个
                if(instance == null){
                    instance = new LazyMan_doubleCheckLock();
                    //不是一个原子操作：1.分配内存，2.执行构造方法，初始化对象，3.把对象指向这个内存空间
                    //在CPU执行的时候顺序可能是132，执行到3的时候另一个线程进来
                    //发现instance不是null，但是这时只有空对象，并没有初始化，这时返回的对象是有问题的！
                }
            }
        }
        return instance;
    }
}
