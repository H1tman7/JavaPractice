package practice8;
import java.util.Scanner;
/*
10. Задание Разворот числа
Дано число n, десятичная запись которого не содержит нулей.
Получите число, записанное теми же цифрами, но в противоположном
порядке.
При решении этой задачи нельзя использовать циклы, строки,
списки, массивы, разрешается только рекурсия и целочисленная
арифметика
Функция должна возвращать целое число, являющееся результатом
работы программы, выводить число по одной цифре нельзя.
 */

public class task10 {
    public static int reverse(int mainValue, int value){
        if (mainValue == 0)
            return value;
        return reverse(mainValue/10, value*10 + mainValue%10);
    }

    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = input.nextInt();
        int ans = reverse(n, 0);
        System.out.println("Ответ: " + ans);
    }
}
