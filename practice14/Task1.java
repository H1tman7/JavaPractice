package practice14;
import java.util.Arrays;
import java.util.Scanner;

/*
1. Необходимо реализовать консольное приложение, позволяющее
манипулировать строкой, разбив ее на элементы путем использования
регулярных выражений.
 */

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Исходная строка: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Введите регулярку: ");
        String p = sc.nextLine();
        System.out.println("Строка с примененной регуляркой: ");
        System.out.println(Arrays.toString(str.split(p)));
    }
}
