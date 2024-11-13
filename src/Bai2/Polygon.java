package Bai2;

import java.awt.*;

public class Polygon extends Shape
{
    private int[] x, y;
    
    public Polygon(int[] x, int[] y, Color color, boolean isFilled)
    {
        super(0, 0, 0, 0, color, isFilled);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics graphics)
    {
        graphics.setColor(color);
        if (isFilled) graphics.fillPolygon(x, y, x.length);
        else graphics.drawPolygon(x, y, x.length);
    }
}
