package flyweight.map;

public class Birch implements Tree{
    //桦树
    private int height;

    private String color;

    public Birch(int height, String color) {
        this.height = height;
        this.color = color;
    }

    @Override
    public void locate(int x, int y, int z) {
        System.out.println(String.format(
                "Birch which is %d height in %s is located at (%d, %d, %d)",
                this.height, this.color, x, y, z));
    }
}
