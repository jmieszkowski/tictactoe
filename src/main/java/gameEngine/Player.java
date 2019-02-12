package gameEngine;

import java.util.Scanner;

@FunctionalInterface
public interface Player {

    boolean insertSymbol(Board board, int k);
    default int getInsertKeyFromPlayer(Board board){
        Scanner inputScanner = new Scanner(System.in);
        int k = inputScanner.nextInt();
        return k;
    }
}
