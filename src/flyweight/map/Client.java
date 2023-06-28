package flyweight.map;

public class Client {

    public static void main(String[] args) {
        Tree tree1 = TreeFactory.getTree(33, "white", "Birch");
        tree1.locate(12, 33, 1);

        Tree tree2 = TreeFactory.getTree(20, "green", "Birch");
        tree2.locate(11, 23, 1);

        Tree tree3 = TreeFactory.getTree(12, "brown", "Poplar");
        tree3.locate(11, 23, 1);

        Tree tree4 = TreeFactory.getTree(33, "white", "Birch");
        tree4.locate(12, 33, 1);

        System.out.println(String.format("tree1:%d | tree2:%d | tree3:%d | tree4:%d",
                tree1.hashCode(), tree2.hashCode(), tree3.hashCode(), tree4.hashCode()));
        //tree1:51228289 | tree2:455896770 | tree3:1323165413 | tree4:51228289
    }
}
