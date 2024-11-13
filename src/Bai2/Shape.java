package Bai2;

import java.awt.*;

public abstract class Shape
{
    protected int x, y, w, h;
    protected Color color;
    protected boolean isFilled;

    public Shape(int x, int y, int w, int h, Color color, boolean isFilled)
    {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = color;
        this.isFilled = isFilled;
    }

    public abstract void draw(Graphics graphics);
}
