package practice16.Task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game extends JFrame{
    private int tmp_count = 3;
    Game(){
        setSize(800, 600);
        setLayout(new BorderLayout());
        JTextArea num = new JTextArea();
        JLabel title = new JLabel("Игра-угадайка", SwingConstants.CENTER);
        JLabel down = new JLabel("Игра-угадайка", SwingConstants.CENTER);
        JLabel input = new JLabel("Введите число:");
        JButton button = new JButton("Проверить число");
        Random random = new Random();
        int answer = random.nextInt(20);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tmp_count >= 1){
                    if (Integer.parseInt(num.getText()) > answer){
                        JOptionPane.showMessageDialog(null, "Загаданное число меньше введенного","Подсказка" , JOptionPane.WARNING_MESSAGE);
                        tmp_count--;
                    }
                    else if (Integer.parseInt(num.getText()) < answer){
                        JOptionPane.showMessageDialog(null, "Загаданное число больше введенного","Подсказка" , JOptionPane.WARNING_MESSAGE);
                        tmp_count--;
                    }
                    else if (Integer.parseInt(num.getText()) == answer){
                        JOptionPane.showMessageDialog(null, "Вы угадали загаданное число","Победа!" , JOptionPane.WARNING_MESSAGE);
                        tmp_count--;
                    }
                }
                else JOptionPane.showMessageDialog(null, "Попытки кончились. Загаданное число: " + answer,"Game Over" , JOptionPane.WARNING_MESSAGE);
            }
        });
        title.addMouseListener(new Mouse("CАО", this));
        input.addMouseListener(new Mouse("ЗАО", this));
        num.addMouseListener(new Mouse("ЦАО", this));
        button.addMouseListener(new Mouse("ВАО", this));
        down.addMouseListener(new Mouse("ЮАО", this));

        add(title, BorderLayout.NORTH);
        add(input, BorderLayout.WEST);
        add(num, BorderLayout.CENTER);
        add(button, BorderLayout.EAST);
        add(down, BorderLayout.SOUTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String [] args){
        new Game();
    }
}
