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
public class Rectangle extends Shape{

    public Rectangle(int w, int h) {
        super(w, h);
    }
    
    @Override
    public void Draw(Graphics g, int x, int y)
    {
        g.drawRect(x, y, Width, Height);
        
    }
    
}