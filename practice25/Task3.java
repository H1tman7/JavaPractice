package practice25;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
3. Составить регулярное выражение, определяющее является ли заданная строка I
P адресом, записанным в десятичном виде.
– пример правильных выражений: 127.0.0.1, 255.255.255.0.
– пример неправильных выражений: 1300.6.7.8, abc.def.gha.bcd.
 */

public class Task3 {
    public static void main(String[] args) {
        String reg = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$";
        System.out.print("Введите IP в формате IPv4: ");
        Scanner scan = new Scanner(System.in);
        String address = scan.next();
        if (Pattern.matches(reg, address))
            System.out.println("Верное выражение");
        else System.out.println("Неверное выражение");
    }
}