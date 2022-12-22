package practice16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
2. Реализуйте программу на Джава с использованием JTextArea и
двумя следующего меню выбора:
a) Цвет: который имеет возможность выбора из три
возможных: синий, красный и черный
b) Шрифт: три вида: “Times New Roman”, “MS Sans Serif”,
“Courier New”.
Замечание. Вы должны написать программу, которая с помощью
меню, может изменять шрифт и цвет текста, написанного в JTextArea
 */
public class Task2 extends JFrame {

    Task2(){
        setSize(500, 250);
        setLayout(null);

        JTextArea text = new JTextArea();
        text.setBounds(220, 30, 200, 100);

        String [] colors = {"Синий", "Красный", "Черный"};
        String [] fonts = {"Times New Roman", "MS Sans Serif", "Courier New"};

        text.setBackground(Color.WHITE);
        text.setFont(new Font(fonts[0], Font.PLAIN, 14));

        JComboBox<String> menuColors = new JComboBox<>(colors);
        menuColors.setBounds(20, 45, 140, 20);

        JComboBox<String> menuFonts = new JComboBox<>(fonts);
        menuFonts.setBounds(20, 70, 140, 20);

        this.getContentPane().setBackground(Color.white);

        menuColors.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (menuColors.getSelectedItem() == "Синий")
                    text.setForeground(Color.BLUE);
                else if (menuColors.getSelectedItem() == "Красный")
                    text.setForeground(Color.RED);
                else text.setForeground(Color.BLACK);
            }
        });
        menuFonts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (menuFonts.getSelectedItem() == fonts[0])
                    text.setFont(new Font(fonts[0], Font.PLAIN, 14));
                else if (menuFonts.getSelectedItem() == fonts[1])
                    text.setFont(new Font(fonts[1], Font.PLAIN, 14));
                else if (menuFonts.getSelectedItem() == fonts[2])
                    text.setFont(new Font(fonts[2], Font.PLAIN, 14));
            }
        });
        add(menuColors);
        add(menuFonts);
        add(text);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        new Task2();
    }
}
