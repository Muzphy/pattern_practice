package adapter.translator;

public class Translator extends Chinese implements WithEnglish{

    @Override
    public void whenMeeting() {
        sayHi();
    }

    @Override
    public void whenLeaving() {
        sayGoodBye();
    }
}
