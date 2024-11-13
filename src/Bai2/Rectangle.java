package Bai2;

import java.awt.*;

public class Rectangle extends Shape
{
    public Rectangle(int x, int y, int w, int h, Color color, boolean isFilled)
    {
        super(x, y, w, h, color, isFilled);
    }

    @Override
    public void draw(Graphics graphics)
    {
        graphics.setColor(color);
        if (isFilled) graphics.fillRect(x, y, w, h);
        else graphics.drawRect(x, y, w, h);
    }
}
