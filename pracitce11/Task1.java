package pracitce11;
import java.text.ParseException;
import java.util.*;

/*
Задание 1
Написать программу, выводящую фамилию разработчика, дату и
время получения задания, а также дату и время сдачи задания. Для
получения последней даты и времени использовать класс Date из пакета
java.util.* (Объявление Dated=newDate() или метод
System.currentTimeMillis().
 */

public class Task1 {
    public static void main(String [] args) throws ParseException {
        Date start = new Date(122, Calendar.SEPTEMBER, 23, 12, 40);
        Date finish = new Date();
        System.out.print("Чечушков\nРабота получена: " + start.toString() + "\nРабота проверена: " + finish.toString() + "\n");
    }
}