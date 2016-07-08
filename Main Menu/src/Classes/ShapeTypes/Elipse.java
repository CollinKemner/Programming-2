/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.ShapeTypes;
import Classes.ShapeTypes.Shape;
import java.awt.Graphics;

/**
 *
 * @author Collin Kemner
 */
public class Elipse extends Shape{

    public Elipse(int w, int h) {
        super(w, h);
    }
    
    @Override
    public void Draw(Graphics g, int x, int y)
    {
        x = 0;
        y = 0;
        g.drawOval(x, y, Width, Height);
    }

    void Draw(Graphics g, Float x, Float y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
