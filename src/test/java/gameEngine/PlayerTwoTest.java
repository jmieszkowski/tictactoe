package gameEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Map;

public class PlayerTwoTest {

    Board boardObj;

    @Before
    public void setUp(){
        this.boardObj = boardObj;
    }

    @Test
    public void testIfInsertWorks(){
        // GIVEN
        boardObj = new Board(9);
        PlayerTwo playerOne = new PlayerTwo("Player", Symbol.cross);
        Map<Integer, Character> board = boardObj.getBoard();
        playerOne.insertSymbol(boardObj,2);
        assertTrue(board.get(2).equals(playerOne.getSymbol().getSymbol()));


    }


}
