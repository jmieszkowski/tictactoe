package gameEngine;

public class PlayerOne implements Player {
    String name;
    Symbol symbol;

    public PlayerOne(String name, Symbol symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    @Override
    public void insertSymbol(Board board, int k) {
            board.insert(k,this.getSymbol());
    }

}