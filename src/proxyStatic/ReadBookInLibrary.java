package proxyStatic;

//it is a proxy
public class ReadBookInLibrary implements Read{

    private Read read;

    public ReadBookInLibrary(Read read) {
        this.read = read;
    }

    @Override
    public void Read() {
        System.out.println("enter a library...");
        read.Read();
        System.out.println("leave the library");
    }
}
