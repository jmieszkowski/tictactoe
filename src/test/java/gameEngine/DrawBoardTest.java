package gameEngine;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class DrawBoardTest {

    Board boardObj;

    @Before
    public void setUp(){
        this.boardObj = boardObj;

    }

    @Test
    public void testIfDrawsEmptyBoard(){
        // GIVEN
        boardObj = new Board(9);
        Map<Integer,Character> board = boardObj.getBoard();

        // WHEN
        DrawBoard.drawBoard(board);
    }

    @Test
    public void testIfDrawBoardIsWorking(){
        // GIVEN
        boardObj = new Board(9);
        Map<Integer, Character> board = boardObj.getBoard();
        Symbol x = new Symbol('X');
        Integer field = new Integer(1);
        // WHEN
        boardObj.insert(field, x);
        DrawBoard.drawBoard(board);

    }

    @Test
    public void testIfDrawsFullBoard(){
        boardObj = new Board(9);
        Map<Integer, Character> board = boardObj.getBoard();
        Symbol x = new Symbol('X');
        for (int i=1; i<= 9; i++){
            System.out.println(i);
            boardObj.insert(i,x);
        }

        DrawBoard.drawBoard(board);
    }
}
