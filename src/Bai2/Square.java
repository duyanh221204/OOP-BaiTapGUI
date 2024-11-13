package Bai2;

import java.awt.*;

public class Square extends Shape
{
    public Square(int x, int y, int sz, Color color, boolean isFilled)
    {
        super(x, y, sz, sz, color, isFilled);
    }

    @Override
    public void draw(Graphics graphics)
    {
        graphics.setColor(color);
        if (isFilled) graphics.fillRect(x, y, w, h);
        else graphics.drawRect(x, y, w, h);
    }
}
