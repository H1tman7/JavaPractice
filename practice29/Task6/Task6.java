package practice29.Task6;

public class Task6 {
    public static void main(String[] args){
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

        String address = "Address";
        System.out.println("Создаем заказ на адрес Address");
        try{
            orderManager.add(address, internetOrder);
        }catch (OrderAlreadyAddedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Пробуем повторно создать заказ на адрес Address");
        try{
            orderManager.add(address, internetOrder);
        }catch (OrderAlreadyAddedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Пробуем создать объект с ценой -100");
        try{
            new Dish(null, -100, null);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Пробуем создать объект без названия");
        try{
            new Dish("", 100 , "");
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        RestaurantOrder restaurantOrder = new RestaurantOrder();
        try {
            orderManager.addRestaurantOrder("Cтолик №1", restaurantOrder);
            System.out.println("Заказ для Столик №1 создан");
        }catch (OrderAlreadyAddedException e) {
            System.out.println(e.getMessage());
        }
        try{
            orderManager.addItemToRestaurantOrder("Столик №2", tests[0]);
        }catch (IllegalTableNumber e) {
            System.out.println(e.getMessage());
        }
    }
}
