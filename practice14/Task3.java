package practice14;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
3. Дан текст со списками цен. Извлечь из него цены в USD, RUВ, EUR.
a) пример правильных выражений: 25.98 USD.
b) пример неправильных выражений: 44 ERR, 0.004 EU.
 */

public class Task3{
    public static ArrayList<String> parseRubUSDEUR(String s){
        Pattern reg  = Pattern.compile("[0-9]+(\\.[0-9]+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher matcher = reg.matcher(s);
        ArrayList<String> ans = new ArrayList<>();
        while (matcher.find()){
            ans.add(matcher.group());
        }
        return ans;
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите стоимость: ");
        String cost = scan.nextLine();
        ArrayList<String> answer = parseRubUSDEUR(cost);
        if (answer.size() == 0)
            System.out.println("\nНеправильное значение");
        else
            System.out.println(answer);
    }
}
