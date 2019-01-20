package gameEngine;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BoardTest {
    Board boardObj;

    @Before
    public void setUp(){
            this.boardObj = boardObj;
    }

    @Test
    public void testIfBoardCreatedSuccessful(){
        // GIVEN
        int n = 3;
        // WHEN
        boardObj = new Board(n);
        // THEN
        assertEquals(n, boardObj.getSize());
    }

    @Test
    public void testIfExtendedBoardCreatedSuccessful(){
        // GIVEN
        int n = 4;
        // WHEN
        boardObj = new Board(n);
        // THEN
        assertEquals(n, boardObj.getSize());
    }

    @Test
    public void testIfInitialBoardIsEmpty(){
        boardObj = new Board(9);
        boardObj.isBoardEmpty();
    }

    @Test
    public void testInsertSymbolsToTheBoard(){
        // GIVEN
        boardObj = new Board(9);
        Map<Integer, Character> board = boardObj.getBoard();
        Symbol x = new Symbol('X');
        Integer field = new Integer(1);
        // WHEN
        boardObj.insert(field, x);
        // THEN
        assertEquals(x.getSymbol(), board.get(field));
        //assertTrue(board.get(1,1).isTic());
        //assertTrue(board.containsTic(1,1));
    }


}