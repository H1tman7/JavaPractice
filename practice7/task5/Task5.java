package practice7.task5;
import java.util.Scanner;
/*
5. Разработайте интерфейс для работы со строками, который
содержит а) функции подсчета символов в строке б) функция возвращает
строку, которая образовывает строку, состоящую из символов исходной
строки s, которые размещены на нечетных позициях: 1, 3, 5, ...в) функцию
инвертирования строки
 */

public class Task5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите исходную строку:");
        String temp = scanner.next();
        Strings str = new Strings(temp);
        int choice = 1;
        while(true){
            System.out.println("Введите номер функции:\n1 - подсчет заданных символов в строке\n2 - вернуть строку, составленную из символов на нечетных элементах\n3 - инвертировать строку");
            choice = scanner.nextInt();
            if(choice == 1){
                System.out.print("Введите символ, который хотите посчитать: ");
                String symbol = scanner.next();
                System.out.println("Количество символов '" + symbol + "' : " + str.countSymbols(symbol.charAt(0)));
            }
            else if(choice == 2){

                System.out.println("Строка, состоящая из символов четных позиций: " + str.oddSymbols());
            }
            else if(choice == 3){
                str.reverse();
                System.out.println("Перевернутая строка: " + str.getStr());
            }
            else
                break;
        }
    }
}