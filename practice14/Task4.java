package practice14;

import java.util.regex.Pattern;

/*
4. Дан текст, необходимо проверить есть ли в тексте цифры, за
которыми не стоит знак «+».
a) пример правильных выражений:(1 + 8) – 9 / 4
b) пример неправильных выражений: 6 / 5 – 2 * 9
 */

public class Task4 {
    public static boolean isHerePlus(String s){
        return Pattern.compile("[0-9]+\\s*\\+").matcher(s).find();
    }

    public static void main(String [] args) {
        System.out.println(isHerePlus("(1 + 8) – 9 / 4"));
        System.out.println(isHerePlus(" 6 / 5 – 2 * 9"));
    }
}
