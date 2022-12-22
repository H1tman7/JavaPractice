package pracitce11;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*
Задание 2.
Приложение, сравнивающее текущую дату и дату, введенную
пользователем c текущим системным временем
 */

public class Task2 {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дату в формате ГГГГ-ММ-ДД");
        String temp = scan.next();
        Date input_date = new SimpleDateFormat("y-M-d").parse(temp);
        Date current_date = new Date();
        int day_in_msec = 24 * 60 * 60 * 1000;
        if (current_date.getTime() - input_date.getTime() < day_in_msec && current_date.getTime() - input_date.getTime() > 0)
            System.out.println("Это сегодня");
        else if (current_date.getTime() - input_date.getTime() > day_in_msec)
            System.out.print("Это - прошлое");
        else System.out.print("Это - будущее");
    }
}
