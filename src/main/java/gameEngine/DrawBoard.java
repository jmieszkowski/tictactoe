package gameEngine;

import java.util.Map;

public class DrawBoard {

    public static void drawBoard(Map<Integer, Character> board){
//        System.out.println("  :  :  ");
//        System.out.println("..:..:...");
//        System.out.println("  :  :  ");
//        System.out.println("..:..:...");
//        System.out.println("  :  :  ");
        System.out.println(String.format((" %s : %s : %s "), replaceNull(board.get(1)), replaceNull(board.get(2)), replaceNull(board.get(3))));
        System.out.println("..:..:...");
        System.out.println(String.format((" %s : %s : %s "), replaceNull(board.get(4)), replaceNull(board.get(5)), replaceNull(board.get(6)) ));
        System.out.println("..:..:...");
        System.out.println(String.format((" %s : %s : %s "), replaceNull(board.get(7)),replaceNull(board.get(8)),replaceNull(board.get(9))));

    }

    public static Character replaceNull(Character ch){
        if (ch == null)
            return Character.MIN_VALUE;
        return ch;
    }
}
