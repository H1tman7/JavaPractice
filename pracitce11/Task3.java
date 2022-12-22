package pracitce11;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*
Задание 3.
Доработайте класс Student предусмотрите поле для хранения даты
рождения, перепишите метод toString() таким образом, чтобы он
разработайте метод, возвращал строковое представление даты рождения по
вводимому в метод формату даты (например, короткий, средний и полный
формат даты).
 */

public class Task3 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя студента: ");
        String name = scanner.next();
        System.out.println("Введите дату в формате ГГГГ-ММ-ДД: ");
        String date = scanner.next();
        Date input_date = new SimpleDateFormat("y-M-d").parse(date);
//        System.out.println(input_date);
        Student output = new Student(name, input_date);
        System.out.println("Выберите форматы даты\n1)гггг.мм.дд\n2)дд,мм,гг\n3)день недели,дд,есяц,гггг\n");
        int choice = scanner.nextInt();
        System.out.println(output.toString(choice));
    }
}