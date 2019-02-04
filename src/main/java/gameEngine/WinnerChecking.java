package gameEngine;

import java.util.Map;
import java.util.Objects;

public class WinnerChecking {
    public boolean checkIfPlayerWins(Board boardObj, Symbol symbol, int k) {
        Map<Integer, Character> board = boardObj.getBoard();
        Character insertedSymbol = board.get(k);

        // this checks horizontally
        if (checkHorizontally(board, insertedSymbol, k)) {
            return true;
        }
        // this checks diagonally from left to right
        else if (checkDiagonally(board, insertedSymbol, k)) {
            return true;
        }
        // this checks upright
        else if (checkUpright(board,insertedSymbol,k))
            return true;
        else
            return false;
    }

    public boolean checkHorizontally(Map<Integer, Character> board, Character insertedSymbol, int k) {

        int keyMinusOne = k - 1;
        int keyPlusOne = k + 1;
        int keyPlusTwo = k + 2;

        // this method check horizontally
        if (k == 1 || k == 4 || k == 7) {
            if (board.get(keyPlusOne).equals(insertedSymbol))
                if (board.get(keyPlusTwo).equals(insertedSymbol))
                    return true;
        } else if (k == 2 || k == 5 || k == 8) {
            if (board.get(keyMinusOne).equals(insertedSymbol))
                if (board.get(keyPlusOne).equals(insertedSymbol))
                    return true;
        } else if (k == 3 || k == 6 || k == 9) {
            if (board.get(keyMinusOne).equals(insertedSymbol))
                if (board.get(keyPlusOne).equals(insertedSymbol))
                    return true;
        }

        return false;
    }

    public boolean checkDiagonally(Map<Integer, Character> board, Character insertedSymbol, int k) {

        int keyDiagonallyOneBefore = k - 3;
        int keyDiagonallyTwoBefore = k - 6;
        int keyDiagonallyOneNext = k + 3;
        int keyDiagonallyTwoNext = k + 6;

        // this method check diagonally
        if (k == 1 || k == 3) {
            if (board.get(keyDiagonallyOneNext).equals(insertedSymbol))
                if (board.get(keyDiagonallyTwoNext).equals(insertedSymbol))
                    return true;

        } else if (k == 7 || k == 9) {
            if (board.get(keyDiagonallyOneBefore).equals(insertedSymbol))
                if (board.get(keyDiagonallyTwoBefore).equals(insertedSymbol))
                    return true;
        }
        return false;
    }

    public boolean checkUpright(Map<Integer, Character> board, Character insertedSymbol, int k) {
        int keyUprightOneBefore = k - 3;
        int keyUprightTwoBefore = k - 6;
        int keyUprightOneNext = k + 3;
        int keyUprightTwoNext = k + 6;


        // this method checks upright
        if (k == 1 || k == 2 || k == 3) {
            if (board.get(keyUprightOneNext).equals(insertedSymbol))
                if (board.get(keyUprightTwoNext).equals(insertedSymbol))
                    return true;
        } else if (k == 4 || k == 5 || k == 6) {
            if (board.get(keyUprightOneBefore).equals(insertedSymbol))
                if (board.get(keyUprightOneNext).equals(insertedSymbol))
                    return true;
        } else if (k == 7 || k == 8 || k == 9) {
            if (board.get(keyUprightOneBefore).equals(insertedSymbol))
                if (board.get(keyUprightTwoBefore).equals(insertedSymbol))
                    return true;
        }

        return false;

    }
}