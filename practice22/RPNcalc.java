package practice22;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;
import static java.lang.Character.isDigit;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;
/*
Задание 1. Напишите программу-калькулятор арифметических
выражений записанных в обратной польской нотации (RPN-калькулятор).
 */

public class RPNcalc{
    public static void main(String[] args){
        Stack <String> st = new Stack<String>();
        String str_ = "";
        String temp;
        int to_stack;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите обратную польскую запись: ");
        str_ = scanner.nextLine();

        for(int i = 0; i < str_.length(); i++){
            if(str_.charAt(i) == ' '){
                continue;
            }
            else if(isDigit(str_.charAt(i))){
                temp = "";
                while(isDigit(str_.charAt(i))){
                    temp += str_.charAt(i);
                    i++;
                }
                i--;
                st.push(temp);
            }
            else{
                to_stack = Integer.parseInt(st.peek());
                st.pop();
                if(str_.charAt(i) == '+')
                    to_stack += parseInt(st.peek());
                else if(str_.charAt(i) == '-')
                    to_stack = parseInt(st.peek()) - to_stack;
                else if(str_.charAt(i) == '*')
                    to_stack *= parseInt(st.peek());
                else if(str_.charAt(i) == '/')
                    to_stack = parseInt(st.peek()) / to_stack;
                st.pop();
                st.push(Integer.toString(to_stack));
            }
        }
        System.out.println("Ответ: " + st.peek());
    }
}