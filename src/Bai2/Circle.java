package Bai2;

import java.awt.*;

public class Circle extends Shape
{
    public Circle(int x, int y, int d, Color color, boolean isFilled)
    {
        super(x, y, d, d, color, isFilled);
    }

    @Override
    public void draw(Graphics graphics)
    {
        graphics.setColor(color);
        if (isFilled) graphics.fillOval(x, y, w, h);
        else graphics.drawOval(x, y, w, h);
    }
}
