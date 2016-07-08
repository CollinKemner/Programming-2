/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.ShapeTypes;

import java.awt.Graphics;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tina
 */
public class LineTest {
    
    public LineTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Draw method, of class Line.
     */
    @Test
    public void testDraw() {
       System.out.println("Draw");
        Graphics g = null;
        int x = 0;
        int y = 0;
        Line instance = null;
        int expResult = 0;
        instance.Draw(g, x, y);
        assertEquals(expResult, x);
    }
    
}
