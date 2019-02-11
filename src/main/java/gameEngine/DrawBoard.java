package gameEngine;

import java.util.Map;

public class DrawBoard {

    Map<Integer, Character> board;

    public DrawBoard(Map<Integer, Character> board) {
        this.board = board;
    }
    void drawBoard(){
//        System.out.println("  :  :  ");
//        System.out.println("..:..:...");
//        System.out.println("  :  :  ");
//        System.out.println("..:..:...");
//        System.out.println("  :  :  ");
        System.out.println(String.format((" %s : %s : %s "),
                replaceEmptyCellWithNumber(board.get(1),1),
                replaceEmptyCellWithNumber(board.get(2),2),
                replaceEmptyCellWithNumber(board.get(3),3)));
        System.out.println("...:...:...");
        System.out.println(String.format((" %s : %s : %s "),
                replaceEmptyCellWithNumber(board.get(4),4),
                replaceEmptyCellWithNumber(board.get(5),5),
                replaceEmptyCellWithNumber(board.get(6),6)));
        System.out.println("...:...:...");
        System.out.println(String.format((" %s : %s : %s "),
                replaceEmptyCellWithNumber(board.get(7),7),
                replaceEmptyCellWithNumber(board.get(8),8),
                replaceEmptyCellWithNumber(board.get(9),9)));

    }

    private static Character replaceEmptyCellWithNumber(Character ch, int i){
        if (ch == Character.MIN_VALUE)
            return (Character.forDigit(i,10));
        return ch;
    }
}
