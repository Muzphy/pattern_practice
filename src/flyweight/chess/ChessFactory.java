package flyweight.chess;

import java.util.HashMap;
import java.util.Map;

public class ChessFactory {
    //负责提供共享对象，客户端不应该直接实例化棋子对象，而应该使用此工厂来获取。
    private static final Map<Color, Chess> chessMap = new HashMap<>();

    public static Chess getChess(Color color) {
        Chess chess = chessMap.get(color);
        if (chess == null) {
            chess = color == Color.WHITE ? new WhiteChess() : new BlackChess();
            chessMap.put(color, chess);
        }
        return chess;
    }
}
