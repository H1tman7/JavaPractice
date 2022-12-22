package practice8;
import java.util.Objects;
import java.util.Scanner;
/*
11. Задание Количество единиц
Дана последовательность натуральных чисел (одно число в строке),
завершающаяся двумя числами 0 подряд. Определите, сколько раз в этой
последовательности встречается число 1. Числа, идущие после двух нулей,
необходимо игнорировать.
В этой задаче нельзя использовать глобальные переменные и
параметры, передаваемые в функцию. Функция получает данные, считывая
их с клавиатуры,а не получая их в виде параметров
 */


public class task11 {
    public static int counter(){
        System.out.println("Введите следующий символ последовательности:");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        if (Objects.equals(str, "00"))
            return 0;
        if (Objects.equals(str, "1"))
            return counter() + 1;
        else
            return counter();
    }
    public static void main(String []args){
        int ans = counter();
        System.out.println("Ответ: " + ans);
    }
}
