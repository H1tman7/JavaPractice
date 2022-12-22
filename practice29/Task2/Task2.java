package practice29.Task2;

public class Task2 {
    public static void main(String[] args){
        Drink drink = new Drink("Вода Bon Aqua",100, "Вода газированная объемом 0.5л");
        Dish dish = new Dish("Паста", 250, "Паста классическая. Вкусная!");
//        System.out.println(drink);
//        System.out.println(dish);
        System.out.println("Получим описание напитка: " + drink.getDescription());
        System.out.println("Получим название блюда: " + dish.getName());
    }
}
