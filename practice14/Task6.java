package practice14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
6. Написать регулярное выражение, определяющее является ли данная
строчка допустимым (корректным) е-mail адресом согласно RFC под
номером 2822.
a) пример правильных выражений: user@example.com,
root@localhost
b) пример неправильных выражений: myhost@@@com.ru,
@my.ru, Julia String
 */

public class Task6 {
    public static boolean checkEmail(String s){
        Matcher m = Pattern.compile(
                "[a-zA-Z0-9]+[a-zA-Z0-9!#$%&'*+\\-/=?^_`{|}~.]*@[a-zA-Z0-9\\-_.]+\\.?[a-zA-Z]+"
        ).matcher(s);
        return m.find() && m.group().equals(s);
    }

    public static void main(String [] args){
        System.out.println(checkEmail("user@example.com"));
        System.out.println(checkEmail("root@localhost"));
        System.out.println(checkEmail("myhost@@@com.ru"));
        System.out.println(checkEmail("@my.ru"));
        System.out.println(checkEmail("Julia String."));
        System.out.println(checkEmail("mchechushkov@mail.ru"));
    }
}