package practice15;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.Stack;

/*
4. Разработайте программу калькулятора вида как представлено
на рис. 15.10 ниже
 */

public class Calculator extends JFrame {
    private JTextField text;
    Calculator(){
        setSize(400, 350);
        setLayout(null);
        text = new JTextField();
        text.setBounds(20, 70, 320, 20);
        JButton[] buttons = new JButton[16];
        JLabel label = new JLabel("Калькулятор");
        label.setBounds(150, 20, 150, 20);
        JLabel label2 = new JLabel("Введите выражение:");
        label2.setBounds(20, 45, 250, 20);

        buttons[0] = new JButton("7");
        buttons[1] = new JButton("8");
        buttons[2] = new JButton("9");
        buttons[3] = new JButton("/");

        buttons[4] = new JButton("4");
        buttons[5] = new JButton("5");
        buttons[6] = new JButton("6");
        buttons[7] = new JButton("*");

        buttons[8] = new JButton("1");
        buttons[9] = new JButton("2");
        buttons[10] = new JButton("3");
        buttons[11] = new JButton("-");

        buttons[12] = new JButton("0");
        buttons[13] = new JButton(".");
        buttons[14] = new JButton("=");
        buttons[15] = new JButton("+");

        for (JButton x: buttons){
            x.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (!Objects.equals(x.getText(), "=")){
                        if (!Objects.equals(x.getText(), "+") && !Objects.equals(x.getText(), "-") && !Objects.equals(x.getText(), "*") && !Objects.equals(x.getText(), "/"))
                            text.setText(text.getText() + x.getText());
                        else text.setText(text.getText() + " " + x.getText() + " ");
                    }
                    else {
                        String [] parse = text.getText().split(" ");
                        text.setText(String.valueOf(buttons(RPN(parse))));
                    }
                }
            });
        }
        for (int i = 0; i < 16; ++i){
            buttons[i].setBounds(40 + (i % 4) * 75, 110 + i / 4 * 40, 50, 30);
            add(buttons[i]);
        }
        add(label);
        add(label2);
        add(text);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public double buttons(String[] tokens) {
        double a, b;
        Stack <Double> S = new Stack <Double>();
        for (String s : tokens) {
            switch (s) {
                case "+":
                    S.add(S.pop() + S.pop());
                    break;
                case "/":
                    b = S.pop();
                    a = S.pop();
                    S.add(a / b);
                    break;
                case "*":
                    S.add(S.pop() * S.pop());
                    break;
                case "-":
                    b = S.pop();
                    a = S.pop();
                    S.add(a - b);
                    break;
                default:
                    S.add(Double.parseDouble(s));
                    break;
            }
        }
        return S.pop();
    }
    public static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    public int getPriority(String el){
        if (Objects.equals(el, "+") || Objects.equals(el, "-"))
            return 1;
        else return 2;
    }
    public String[] RPN(String [] tokens){
        String rpn = "";
        Stack<String> stack = new Stack<>();
        for (String x :tokens){
            if (isNumber(x))
                rpn = rpn + x + " ";
            else{
                if (!stack.isEmpty() && getPriority(x) <= getPriority(stack.peek()))
                    rpn = rpn + stack.pop() + " ";
                stack.push(x);
            }
        }
        while (!stack.isEmpty())
            rpn = rpn + stack.pop() + " ";
        return rpn.split(" ");
    }

    public static void main(String [] args){
        new Calculator();
    }
}