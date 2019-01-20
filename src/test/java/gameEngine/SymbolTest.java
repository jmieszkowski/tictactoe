package gameEngine;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class SymbolTest {

    @Test
    public void testIfSymbolValidatingIsWorking(){
        //WHEN
        Symbol x = new Symbol('X');

    }

    @Test
    public void testIfSymbolHandlesPassingWrongSymbol(){
        // GIVEN
        // WHEN
        try {
            Symbol symbol = new Symbol('A');
            fail();
        } catch (WrongSymbolExc e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            e.printStackTrace();
            fail();
        }
    }
}
