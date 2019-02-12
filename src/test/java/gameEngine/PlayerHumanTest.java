package gameEngine;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import static org.junit.Assert.*;
public class PlayerHumanTest {
    Board boardObj;


    @Before
    public void setUp(){
        this.boardObj = boardObj;
    }

    @Test
    public void testIfInsertWorks(){
        // GIVEN
        boardObj = new Board(9);
        PlayerHuman playerOne = new PlayerHuman("Player", Symbol.cross);
        Map<Integer, Character> board = boardObj.getBoard();
        playerOne.insertSymbol(boardObj,5);
        assertTrue(board.get(5).equals(playerOne.getSymbol().getSymbol()));
    }
}
