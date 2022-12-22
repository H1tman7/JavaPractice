package practice29.Task5;

import java.util.Arrays;

public class Task5 {
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

        OrderManager orderManager = new OrderManager();
        //Добавляем адрес к интернет заказу
        orderManager.add("Address", internetOrder);
        //Добавили новую позицию в заказ с конкретным адресом
        orderManager.addItemToOrder("Address", new Drink("Red Bull",250, "Бодрящий напиток"));
        System.out.println(Arrays.toString(orderManager.getInternetOrders()));

        System.out.println("Количество позиций с Red Bull: " + orderManager.itemNameCount("Red Bull"));
        System.out.println("\n\nПолучим интернет заказ по указанному адресу:");
        System.out.println(orderManager.getOrder("Address"));
        System.out.println("Текущее количество интернет-заказов: " + orderManager.internetOrdersCount());
        orderManager.removeOrder("Address");
        System.out.println("Массив интернет заказов после их удаления по адресу:\n" + Arrays.toString(orderManager.getInternetOrders()));
        System.out.println("Текущее количество интернет-заказов: " + orderManager.internetOrdersCount());
    }
}
