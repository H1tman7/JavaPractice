package practice29.Task4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        InternetOrder internetOrder = new InternetOrder();
        Item[] tests = {new Drink("Вода Bon Aqua",100, "Вода газированная объемом 0.5л"),
                new Drink("Red Bull",150, "Бодрящий напиток"),
                new Dish("Паста", 250, "Паста классическая. Вкусная!"),
                new Dish("Пельмени", 500, "Пельмени. М-м-м!")};
        internetOrder.add(tests[0]);
        internetOrder.add(tests[1]);
        internetOrder.add(tests[2]);
        internetOrder.add(tests[3]);

        System.out.println("Названия всех позиций в наличии: " + Arrays.toString(internetOrder.getNames()));
        internetOrder.removeOne("Red Bull");
        System.out.println("Названия всех позиций в наличии: " + Arrays.toString(internetOrder.getNames()));

        System.out.println(internetOrder);

        System.out.println("Интернет заказ, отсортированный по стоимости товара(сначала самый дорогой): ");
        System.out.println(Arrays.toString(internetOrder.sortedItemsByCostDescription()) + "\n");

        internetOrder.add(new Dish("Паста", 250, "Паста классическая. Вкусная!"));
        System.out.println("Интернет заказ после добавления второго товара Паста");
        System.out.println(internetOrder);
        System.out.println("Количество позиций Паста: " + internetOrder.countItemsByName("Паста"));
        internetOrder.removeAll("Паста");
        System.out.println("Интернет заказ после удаления всех позиций Паста");
        System.out.println(internetOrder);
        System.out.println("\nСумма заказа: " + internetOrder.costTotal());
        System.out.println("Количество объектов: " + internetOrder.size());
        System.out.println("Названия заказываемых позиций: " + Arrays.toString(internetOrder.getNames()));
    }
}
