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
 * @author Tina
 */
public class Strings extends Shape {

    public Strings(int w, int h) {
        super(w, h);
    }

    @Override
    
    public void Draw(Graphics g, int x, int y)
    {
        g.drawArc(x, y, Width, Height, Width, Height);
        
    }
    
}
