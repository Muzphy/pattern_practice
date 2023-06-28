package flyweight.map;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    //使用工厂实例化树

    //用于存放对象
    private static final Map<String, Tree> treeMap = new HashMap<>();

    public static Tree getTree(int height, String color, String type){
        String mixCode = type + "_" + color + "_" + String.valueOf(height);
        Tree tree = treeMap.get(mixCode);
        if(tree == null){
            if(type.equals("Birch")){
                tree = new Birch(height, color);
                treeMap.put(mixCode, tree);
            }else if(type.equals("Poplar")){
                tree = new Poplar(height, color);
                treeMap.put(mixCode, tree);
            }
        }
        return tree;
    }
}
