package gameEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    Map<Integer, Character> board;


    public Board(int size){
        board = new HashMap<Integer, Character>();

        for(int i =1; i<=size;i++) {
            board.put(i, Character.MIN_VALUE);
            }
        }


    public Map<Integer, Character> getBoard() {
        return board;
    }

    public int getSize(){
        return board.size();
    }

    public boolean isBoardEmpty(){
        return board.isEmpty();
    }

    public boolean isCellEmpty(int k) {
        if (board.get(k) == Character.MIN_VALUE)
            return true;
        else
            return false;
    }

    public void insert(int k, Symbol symbol){
        board.put(k,symbol.getSymbol());
    }

}
