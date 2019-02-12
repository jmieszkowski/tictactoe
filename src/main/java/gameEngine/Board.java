package gameEngine;

import java.util.HashMap;
import java.util.Map;

public class Board {
    Map<Integer, Character> board;


    public Board(int size){
        board = new HashMap<Integer, Character>();

        for(int i =1; i<=size;i++) {
            board.put(i, Character.MIN_VALUE); // Character.MIN_VALUE because i dont want to have null here
            }
        }


    public Map<Integer, Character> getBoard() {
        return board;
    }

    int getSize(){
        return board.size();
    }

    boolean isBoardEmpty(){ // used to check if initialed board is empty
        return board.isEmpty();
    }

    public boolean isCellEmpty(int k) {
        if (board.get(k) == Character.MIN_VALUE)
            return true;
        else
            return false;
    }
    boolean isBoardFull(){ // used to end game if the board is full
        for (int i =1; i <= board.size();i++){
            if ((board.get(i)).equals(Character.MIN_VALUE))
                return false;
        }
        return true;

    }

    void insert(int k, Symbol symbol){
        board.put(k,symbol.getSymbol());
    }

}
