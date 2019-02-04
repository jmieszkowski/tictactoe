package gameEngine;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;
public class PlayerOneTest {
    Board boardObj;


    @Before
    public void setUp(){
        this.boardObj = boardObj;
    }

    @Test
    public void testIfInsertWorks(){
        // GIVEN
        boardObj = new Board(9);
        PlayerOne playerOne = new PlayerOne("Player", new Symbol('X'));
        Map<Integer, Character> board = boardObj.getBoard();
        playerOne.insertSymbol(boardObj,5);
        assertTrue(board.get(5).equals(playerOne.getSymbol().getSymbol()));
    }
}
