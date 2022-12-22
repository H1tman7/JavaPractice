package practice29.Task3;

public class Task3 {
    public static void main(String[] args) {
        InternetOrder internetOrder = new InternetOrder();
        Item[] temp = {new Drink("Вода Bon Aqua",100, "Вода газированная объемом 0.5л"),
                new Drink("Red Bull",150, "Бодрящий напиток"),
                new Dish("Паста", 250, "Паста классическая. Вкусная!"),
                new Dish("Пельмени", 500, "Пельмени. М-м-м!")};
        internetOrder.insert(temp[0]);
        internetOrder.insert(temp[1]);
        internetOrder.insert(temp[2]);
        internetOrder.insert(temp[3]);
        System.out.println(internetOrder);
        internetOrder.remove(temp[2]);
        System.out.println("Заказ с одной удаленной позицией:");
        System.out.println(internetOrder);
    }
}
