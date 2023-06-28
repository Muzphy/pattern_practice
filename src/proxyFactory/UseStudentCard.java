package proxyFactory;

public class UseStudentCard implements UseCard{
    @Override
    public void useCard() {
        System.out.println("using the student card...");
    }
}
