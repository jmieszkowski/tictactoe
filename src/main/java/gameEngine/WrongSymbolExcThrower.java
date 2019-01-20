package gameEngine;

public class WrongSymbolExcThrower {
    public static void throwWrongSymbolExc(){
        throw new WrongSymbolExc("Wrong symbol. Symbol must be X or O!");
    }
}
