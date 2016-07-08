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
public class ShapeTest {
    
    public ShapeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Draw method, of class Shape.
     */
    @Test
    public void testDraw() {
        System.out.println("Draw");
        Graphics g = null;
        int x = 0;
        int y = 0;
        Shape instance = null;
        instance.Draw(g, x, y);
        int expResult = 0;
        assertEquals(expResult, x);
        
    }
    
}
