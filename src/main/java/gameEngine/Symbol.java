package gameEngine;

import java.util.Objects;

public class Symbol {
    Character symbol;

    public Symbol(Character symbol){
        this.symbol = symbol;
        this.validateSymbol();
    }

    public Character getSymbol() {
        return symbol;
    }



    public void validateSymbol() throws RuntimeException{
        if (!this.symbol.equals('X') && !this.symbol.equals('O'))
            WrongSymbolExcThrower.throwWrongSymbolExc();
    }

}

