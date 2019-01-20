package gameEngine;

public class WrongSymbolExc extends RuntimeException {

    public WrongSymbolExc() {
    }


    public WrongSymbolExc(String s) {
        super(s);
    }

    public WrongSymbolExc(String s, Throwable throwable) {
        super(s, throwable);
    }
}
