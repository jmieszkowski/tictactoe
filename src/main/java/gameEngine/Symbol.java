package gameEngine;

public enum Symbol {
    cross('X'),
    circle('O');

    private Character symbol;

    Symbol(Character symbol) {
        this.symbol = symbol;
    }

    public Character getSymbol() {
        return symbol;
    }
}
