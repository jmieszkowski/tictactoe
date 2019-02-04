package gameEngine;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WinnerCheckingTest {

    Board boardObj;

    @Before
    public void setUp(){
        this.boardObj = boardObj;
    }



    @Test
    public void testIfHorizontalCheckerReturnTrue(){
        boardObj = new Board(9);

        WinnerChecking winnerChecking = new WinnerChecking();
        PlayerOne playerOne = new PlayerOne("player", new Symbol('X'));

        playerOne.insertSymbol(boardObj,1);
        playerOne.insertSymbol(boardObj,2);
        playerOne.insertSymbol(boardObj,3);

        assertTrue(winnerChecking.checkIfPlayerWins(boardObj,playerOne.getSymbol(),1));
    }

    @Test
    public void testIfHorizontallReturnFalse(){
        boardObj = new Board(9);
        Map<Integer, Character> board = boardObj.getBoard();


        WinnerChecking winnerChecking = new WinnerChecking();
        PlayerOne playerOne = new PlayerOne("player", new Symbol('X'));
        PlayerTwo playerTwo = new PlayerTwo("playertwo", new Symbol('O'));

        playerOne.insertSymbol(boardObj,1);
        playerTwo.insertSymbol(boardObj,2);
        playerOne.insertSymbol(boardObj,3);


        assertFalse(winnerChecking.checkIfPlayerWins(boardObj,playerOne.getSymbol(),1));

    }

    @Test
    public void testIfDiagonallReturnTrue(){
        boardObj = new Board(9);
        Map<Integer, Character> board = boardObj.getBoard();


        WinnerChecking winnerChecking = new WinnerChecking();
        PlayerOne playerOne = new PlayerOne("player", new Symbol('X'));

        playerOne.insertSymbol(boardObj,1);
        playerOne.insertSymbol(boardObj,5);
        playerOne.insertSymbol(boardObj,9);


        assertTrue(winnerChecking.checkIfPlayerWins(boardObj,playerOne.getSymbol(),1));

    }
}
