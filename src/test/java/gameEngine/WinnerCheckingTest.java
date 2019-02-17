package gameEngine;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class WinnerCheckingTest {
    Board boardObj;

    @Before
    public void setUp() {
        this.boardObj = boardObj;
    }

    @Test
    public void testIfWinnerCheckingWorksForAnyWin() {
        boardObj = new Board(9);
        PlayerHuman player = new PlayerHuman("player", Symbol.cross);
        WinnerChecking winnerChecking = new WinnerChecking();
        player.insertSymbol(boardObj, 1);
        player.insertSymbol(boardObj, 5);
        player.insertSymbol(boardObj, 9);
        assertTrue(winnerChecking.checkIfPlayerWins(boardObj, player.getSymbol()));

    }

    @Test
    public void testIfUprightCheckingWorks() {
        boardObj = new Board(9);
        PlayerHuman player = new PlayerHuman("player", Symbol.circle);
        WinnerChecking winnerChecking = new WinnerChecking();
        player.insertSymbol(boardObj, 1);
        player.insertSymbol(boardObj, 4);
        player.insertSymbol(boardObj, 7);
        assertTrue(winnerChecking.checkIfPlayerWins(boardObj, player.getSymbol()));

    }

    @Test
    public void testIfHorizontallyCheckingWorks() {
        boardObj = new Board(9);
        PlayerHuman player = new PlayerHuman("player", Symbol.circle);
        WinnerChecking winnerChecking = new WinnerChecking();
        player.insertSymbol(boardObj, 1);
        player.insertSymbol(boardObj, 2);
        player.insertSymbol(boardObj, 3);
        assertTrue(winnerChecking.checkIfPlayerWins(boardObj, player.getSymbol()));
    }

    @Test
    public void testIfWinnerCheckingReturnFalse(){
        boardObj = new Board(9);
        PlayerHuman player = new PlayerHuman("player", Symbol.circle);
        WinnerChecking winnerChecking = new WinnerChecking();
        player.insertSymbol(boardObj, 1);
        player.insertSymbol(boardObj, 4);
        player.insertSymbol(boardObj, 9);
        assertFalse(winnerChecking.checkIfPlayerWins(boardObj,player.getSymbol()));
    }
}
