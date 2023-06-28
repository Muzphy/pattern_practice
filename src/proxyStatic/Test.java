package proxyStatic;

public class Test {
    public static void main(String[] args) {
        ReadBook readBook = new ReadBook();
        System.out.println("=====without a proxy");
        readBook.Read();
        System.out.println("=====with a proxy");
        ReadBookInLibrary readBookInLibrary = new ReadBookInLibrary(readBook);
        readBookInLibrary.Read();
    }
}

