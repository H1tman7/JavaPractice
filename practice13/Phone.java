package practice13;

/*
Задание 5. (25%) Разработайте класс, который получает строковое
представление телефонного номера в одном из двух возможных строковых
форматов:
+<Код страны><Номер 10 цифр>, например “+79175655655” или
“+104289652211” или
8<Номер 10 цифр> для России, например “89175655655”
и преобразует полученную строку в формат:
+<Код страны><Три цифры>–<Три цифры>–<Четыре цифры>
 */

public class Phone {
    final private String countryCode, reg, threeNum, fourNum;
    public Phone(String number){
        if(number.startsWith("8"))
            countryCode = "+7";
        else
            countryCode = number.substring(0, number.length()-10);
        reg = number.substring(number.length()-10, number.length()-7);
        threeNum = number.substring(number.length()-7, number.length()-4);
        fourNum = number.substring(number.length()-4);
    }

    @Override
    public String toString() {
        return countryCode + reg + "-" + threeNum + "-" + fourNum;
    }

    public static void main(String [] args){
        System.out.println(new Phone("+79995670123"));
        System.out.println(new Phone("+109862452121"));
        System.out.println(new Phone("88005553535"));
    }
}
