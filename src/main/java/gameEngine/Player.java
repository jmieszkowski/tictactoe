package gameEngine;

import java.util.Scanner;

@FunctionalInterface
public interface Player {

    void insertSymbol(Board board, int k);
    default int getSymbolFromPlayer(Board board){
        Scanner inputScanner = new Scanner(System.in);
        int k = inputScanner.nextInt();
        return k;
    }
}
