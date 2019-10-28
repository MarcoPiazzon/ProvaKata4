package ProvaKata4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Test(){
        assertTrue("127.0.0.1",true);
    }

    @Test
    public void Test1(){
        assertFalse("123.456.789.0",false);
    }
}
