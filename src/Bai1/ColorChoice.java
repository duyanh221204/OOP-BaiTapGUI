package Bai1;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class ColorChoice extends JFrame
{
    private JComboBox<String> comboBox;
    private JLabel label;
    
    public ColorChoice()
    {
        setTitle("Color Choice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Hãy chọn màu", SwingConstants.CENTER);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        label.setVisible(true);
        add(label, BorderLayout.CENTER);

        comboBox = new JComboBox<>();
        comboBox.addItem("Reset");
        comboBox.addItem("Trắng");
        comboBox.addItem("Đen");
        comboBox.addItem("Đỏ");
        comboBox.addItem("Xanh lá cây");
        comboBox.addItem("Xanh nước biển");
        comboBox.addItem("Vàng");
        comboBox.addItem("Hồng");

        comboBox.addActionListener(_ ->
        {
            switch (Objects.requireNonNull(comboBox.getSelectedItem()).toString())
            {
                case "Reset":
                    getContentPane().setBackground(null);
                    label.setVisible(true);
                    break;
                case "Trắng":
                    getContentPane().setBackground(Color.white);
                    label.setVisible(false);
                    break;
                case "Đen":
                    getContentPane().setBackground(Color.black);
                    label.setVisible(false);
                    break;
                case "Đỏ":
                    getContentPane().setBackground(Color.red);
                    label.setVisible(false);
                    break;
                case "Xanh lá cây":
                    getContentPane().setBackground(Color.green);
                    label.setVisible(false);
                    break;
                case "Xanh nước biển":
                    getContentPane().setBackground(Color.blue);
                    label.setVisible(false);
                    break;
                case "Vàng":
                    getContentPane().setBackground(Color.yellow);
                    label.setVisible(false);
                    break;
                case "Hồng":
                    getContentPane().setBackground(Color.pink);
                    label.setVisible(false);
                    break;
            }
        });

        setSize(450, 450);
        add(comboBox, BorderLayout.NORTH);
        setVisible(true);
    }
}
