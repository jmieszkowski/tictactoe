package gameEngine;

import java.util.Map;

public class DrawBoard {

    public static void drawBoard(Map<Integer, Character> board){
//        System.out.println("  :  :  ");
//        System.out.println("..:..:...");
//        System.out.println("  :  :  ");
//        System.out.println("..:..:...");
//        System.out.println("  :  :  ");
        System.out.println(String.format((" %s : %s : %s "), (board.get(1)), (board.get(2)), (board.get(3))));
        System.out.println("..:..:...");
        System.out.println(String.format((" %s : %s : %s "), (board.get(4)), (board.get(5)), (board.get(6)) ));
        System.out.println("..:..:...");
        System.out.println(String.format((" %s : %s : %s "), (board.get(7)),(board.get(8)),(board.get(9))));

    }
//
//    public static Character replaceNull(Character ch){
//        if (ch == null)
//            return Character.MIN_VALUE;
//        return ch;
//    }
}
