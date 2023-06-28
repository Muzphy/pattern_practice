package singleton;
public class Test1 {
    public static void main(String[] args) {
        //LazyMan not safe
//        LazyMan_unsafe instance1 = new LazyMan_unsafe();
//        LazyMan_unsafe instance2 = new LazyMan_unsafe();
//        instance1.printInfo();
//        instance2.printInfo();

//        LazyMan_unsafe instance3 = LazyMan_unsafe.getInstance();
//        LazyMan_unsafe instance4 = LazyMan_unsafe.getInstance();
//        instance3.printInfo();
//        instance4.printInfo();

//        for(int i = 0 ; i < 10 ; i++){
//            new Thread(()->{
//                LazyMan_unsafe.getInstance();
//            }).start();
//        }

//        for(int i = 0 ; i < 10 ; i++){
//            new Thread(()->{
//                LazyMan_safe.getInstance();
//            }).start();
//        }

        for(int i = 0 ; i < 10 ; i++){
            new Thread(()->{
                LazyMan_doubleCheckLock.getInstance();
            }).start();
        }

        for(int i = 0 ; i < 10 ; i++){
            new Thread(()->{
                HungryMan.getInstance();
            }).start();
        }
    }
}
