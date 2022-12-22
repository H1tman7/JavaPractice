package practice7.task4;
import java.util.Scanner;

/*
4. Разработайте интерфейс MathCalculable, который содержит
объявления математических функций: возведения в степень и модуль
комплексного числа, также содержит число PI. Напишите класс MathFunc,
который реализует, реализует этот интерфейс. Например, вычисления
длины окружности, для чего используйте число PI из интерфейса.
 */

public class task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        MathFunc c_num;
        System.out.print("Введите действительную часть комплексного числа: ");
        double re = scanner.nextDouble();
        System.out.print("Введите мнимую часть комплексного числа: ");
        double im = scanner.nextDouble();
        c_num = new MathFunc(re, im);
        System.out.println(c_num);
        System.out.print("Введите степень, в которую возвести ваше число: ");
        int n = scanner.nextInt();
        c_num.powComplex(n);
//        System.out.println(c_num.toString());
    }
}