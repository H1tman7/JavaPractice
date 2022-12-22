package practice13;

import java.util.Scanner;

/*
Задание 1 на класс String (5%)
1. Напишите метод, который принимает в качестве параметра
любую строку, например “I like Java!!!”.
2. Распечатать последний символ строки. Используем метод
String.charAt().
3. Проверить, заканчивается ли ваша строка подстрокой “!!!”.
Используем метод String.endsWith().
4. Проверить, начинается ли ваша строка подстрокой “I like”.
Используем метод String.startsWith().
5. Проверить, содержит ли ваша строка подстроку “Java”.
Используем метод String.contains().
6. Найти позицию подстроки “Java” в строке “I like Java!!!”.
7. Заменить все символы “а” на “о”.
8. Преобразуйте строку к верхнему регистру.
9. Преобразуйте строку к нижнему регистру.
10. Вырезать строку Java c помощью метода String.substring().
 */

public class Task1 {
    public static void WriteString(String str){
        System.out.println("1) Строка, переданнная в качестве параметра: " + str + "\n");
    }

    public static void main(String [] args){
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str;
        str = scanner.nextLine();
        WriteString(str);

        System.out.println("2) Последний символ: " + str.charAt(str.length() - 1) + "\n");

        if (str.endsWith("!!!"))
            System.out.println("3) Строка заканчивается на !!! \n");
        else System.out.println("3) Строка не заканчивается на !!! \n");

        if (str.startsWith("I like"))
            System.out.println("4) Строка начинается с I like\n");
        else System.out.println("4) Строка не начинается с I like\n");

        if (str.contains("Java"))
            System.out.println("5) Строка содержит Java\n");
        else System.out.println("5) Строка не содержит Java\n");

        if (str.contains("Java")){
            int position = str.indexOf("Java");
            System.out.println("6) Позиция подстроки Java: " + position + "\n");
        }
        else System.out.println("6) Строка не содержит Java\n");

        System.out.println("7) Строка с замененными символами 'a': " + str.replace('a', 'o' ) + "\n");

        System.out.println("8) Строка в верхнем регистре: " + str.toUpperCase() + "\n");
        System.out.println("9) Строка в нижнем регистре: " + str.toLowerCase() + "\n");

        if (str.contains("Java")){
            int position = str.indexOf("Java");
            System.out.println("10) Новая строка: " + str.substring(0, position) + str.substring(position + 4) + "\n");
        }
        else System.out.println("10. Строка не содержит Java\n");

    }
}
