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
public class Line extends Shape {
    
    public Line(int w, int h) {
        super(w, h);
    }
    
    
    public void Draw(Graphics g, int x, int y)
    {
        g.drawLine(x, y, Width, Height);
    }
}
