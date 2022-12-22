package practice27;
import java.util.HashMap;
import java.util.Map;

/*
2.	Создайте класс Map<String, String> и добавьте десять записей, которые представляют пары (фамилия, имя). Проверьте, сколько людей имеют одинаковое имя или фамилию. Требования к программе:
a)	Программа не должна отображать текст на экране.
b)	Программа не должна считывать значения с клавиатуры
c)	Метод createMap () должен создать и вернуть HashMap, который имеет элементы (String, String) и содержит 10 записей, представляющих пары (фамилия, имя).
d)	Метод getSameFirstNameCount () должен возвращать количество людей с одинаковыми именами.
e)	Метод getSameLastNameCount () должен возвращать количество людей с одинаковой фамилией
 */

public class Task2 {
    public static HashMap<String, String> createMap(){
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 10; i++) {
            map.put("Chechushkov"+i, "Mike");
        }
        return (HashMap<String, String>) map;
    }
    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name))
                count++;
        }
        return count;
    }
    public static int getCountTheSameLastName(HashMap<String, String> map, String second_name) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(second_name))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Сгенерированный ассоциативный список:");
        System.out.println(createMap());
        System.out.print("Количество людей с именем Mike: ");
        System.out.println(getCountTheSameFirstName(createMap(), "Mike"));
        System.out.print("Количество людей с фамилией Chechushkov5: ");
        System.out.println(getCountTheSameLastName(createMap(), "Chechushkov5"));
    }
}
