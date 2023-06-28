package singleton;
//枚举单例可以有效防御两种破坏单例（即使单例产生多个实例）的行为：反射攻击与序列化攻击
//JDK反射机制内部完全禁止了用反射创建枚举实例的可能性。
public enum EnumInit {

    INSTANCE;

    private EnumInit(){}//无用，实际上有一个有参的构造方法

    public static EnumInit getInstance(){
        return INSTANCE;
    }
}
