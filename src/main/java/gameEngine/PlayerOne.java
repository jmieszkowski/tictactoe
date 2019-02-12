package gameEngine;

public class PlayerOne implements Player {
    final String name;
    final Symbol symbol;


    public PlayerOne(String name, Symbol symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    @Override
    public boolean insertSymbol(Board board, int k) {
        if (board.isCellEmpty(k)) { // check if cell is empty, i dont want to reassign value to any key
            board.insert(k, this.getSymbol());
            return true;
        } else return false;
    }

}
