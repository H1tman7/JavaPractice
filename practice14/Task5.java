package practice14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
5. Написать регулярное выражение, определяющее является ли данная
строчка датой в формате dd/mm/yyyy. Начиная с 1900 года до 9999
года.
a) пример правильных выражений: 29/02/2000, 30/04/2003,
01/01/2003.
b) пример неправильных выражений: 29/02/2001, 30-04-2003,
1/1/1899.
 */

public class Task5 {
    public static boolean isDate(String s){
        Matcher matcher = Pattern.compile(
                "((29/02/((19([2468][048])|([13579][26])|(0[48]))  | ([2-9]\\d([2468][048]) | ([13579][26]))|([2468][048]00)|([3579][26]00))) |  ((2[0-8]/02/((19\\d\\d)|([2-9]\\d{3}))))  |  (((0?\\d)| ([12]\\d) | (3[01])) / ((0?[013456789]) | (1[12]))/((19\\d\\d) | ([2-9]\\d{3}))))"
        ).matcher(s);
        return matcher.find() && matcher.group().equals(s);
    }

    public static void main(String [] args){
        System.out.println(isDate("29/02/2000"));
        System.out.println(isDate("30/04/2003"));
        System.out.println(isDate("01/01/2003"));
        System.out.println(isDate("29/02/2001"));
        System.out.println(isDate("30-04-2003"));
        System.out.println(isDate("1/1/1899"));
    }
}
