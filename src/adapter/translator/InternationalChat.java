package adapter.translator;

public class InternationalChat {
    public static void main(String[] args) {
        WithEnglish e = new Translator();
        e.whenMeeting();
        e.whenLeaving();
    }
}
