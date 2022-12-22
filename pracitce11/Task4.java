package pracitce11;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
Задание 4.
Напишите пользовательский код, который формирует объекты Date и
Calendar по следующим данным, вводимым пользователем:
<Год><Месяц><Число><Часы><минуты>
 */

public class Task4 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате дд-мм-гггг чч:мм");
        String inp_str = scanner.nextLine();
        Date output = new SimpleDateFormat("dd-MM-yyyy HH:mm").parse(inp_str);
        System.out.print(output);
    }
}