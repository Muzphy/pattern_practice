package proxyFactory;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        UseCard useCard = new UseStudentCard();
        System.out.println(useCard.getClass());
        UseCard proxyObject = (UseCard) new UseCardProxyFactory(useCard).getProxyInstance();
        System.out.println(useCard.getClass());
        proxyObject.useCard();
    }
}
