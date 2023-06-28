package flyweight.map;

public interface Tree {
    //作为各种树的抽象，剥离所有属性，保留最基本要素，即位置
    public void locate(int x, int y, int z);
}
