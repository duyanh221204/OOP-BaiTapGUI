package Bai2;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class ShapeDrawer extends JFrame
{
    private JComboBox<String> shapeChoice, fillChoice;
    private JButton colorButton;
    private JPanel controlPanel, drawPanel;
    private Shape shape;
    private Color color = Color.black;

    public ShapeDrawer()
    {
        setTitle("Shape Drawer");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        shapeChoice = new JComboBox<>();
        shapeChoice.addItem("Square");
        shapeChoice.addItem("Rectangle");
        shapeChoice.addItem("Circle");
        shapeChoice.addItem("Polygon");

        fillChoice = new JComboBox<>();
        fillChoice.addItem("Fill");
        fillChoice.addItem("Not Fill");

        colorButton = new JButton("Choose color");

        controlPanel = new JPanel();
        controlPanel.add(new JLabel("Shape: "));
        controlPanel.add(shapeChoice);
        controlPanel.add(new Label("Style: "));
        controlPanel.add(fillChoice);
        controlPanel.add(colorButton);

        drawPanel = new JPanel()
        {
            @Override
            protected void paintComponent(Graphics graphics)
            {
                super.paintComponent(graphics);
                shape.draw(graphics);
            }
        };
        drawPanel.setBackground(Color.white);

        colorButton.addActionListener(_ ->
        {
            color = JColorChooser.showDialog(null, "Choose a color", color);
            createShape();
            drawPanel.repaint();
        });

        shapeChoice.addActionListener(_ ->
        {
            createShape();
            drawPanel.repaint();
        });

        fillChoice.addActionListener(_ ->
        {
            createShape();
            drawPanel.repaint();
        });

        setLocationRelativeTo(null);
        add(controlPanel, BorderLayout.NORTH);
        add(drawPanel, BorderLayout.CENTER);
        createShape();
        setVisible(true);
    }

    private void createShape()
    {
        String type = Objects.requireNonNull(shapeChoice.getSelectedItem()).toString();
        boolean isFilled = fillChoice.getSelectedItem().equals("Fill");

        switch (type)
        {
            case "Square":
                shape = new Square(240, 60, 100, color, isFilled);
                break;
            case "Rectangle":
                shape = new Rectangle(240, 60, 150, 100, color, isFilled);
                break;
            case "Circle":
                shape = new Circle(240, 60, 100, color, isFilled);
                break;
            case "Polygon":
                shape = new Polygon(new int[]{150, 200, 250, 200}, new int[]{100, 50, 100, 150}, color, isFilled);
                break;
        }
    }
}
