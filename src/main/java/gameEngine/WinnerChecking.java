package gameEngine;

import java.util.*;

class WinnerChecking {
    // this list contains all possibilities to win
    private List<List> winPossibilities = new LinkedList<>(Arrays.asList(
            // horizontally
            new LinkedList<>(Arrays.asList(1, 2, 3)),
            new LinkedList<>(Arrays.asList(4, 5, 6)),
            new LinkedList<>(Arrays.asList(7, 8, 9)),
            // upright
            new LinkedList<>(Arrays.asList(1, 4, 7)),
            new LinkedList<>(Arrays.asList(2, 5, 8)),
            new LinkedList<>(Arrays.asList(3, 6, 9)),
            // diagonally
            new LinkedList<>(Arrays.asList(1, 5, 9)),
            new LinkedList<>(Arrays.asList(3, 5, 7))
            )
    );

    private Set<Integer> symbolsFromPlayerOnBoard = new LinkedHashSet<>();

    // used to check if player wins
    boolean checkIfPlayerWins(Board boardObj, Symbol symbol) {

        Map<Integer, Character> board = boardObj.getBoard();
        Character insertedSymbol = symbol.getSymbol();

        for (int i = 1; i <= board.size(); i++)
            if (board.get(i).equals(insertedSymbol)) symbolsFromPlayerOnBoard.add(i);

        for (List<Integer> l : winPossibilities){
         if (symbolsFromPlayerOnBoard.contains(l.get(0)) && symbolsFromPlayerOnBoard.contains(l.get(1))
                    && symbolsFromPlayerOnBoard.contains(l.get(2))) return true;
        }
        return false;
    }
}