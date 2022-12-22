package practice29.Task1;

/*
1. Создайте класс Drink – напитка. Класс описывает сущность – напиток и
характеризуется следующими свойствами - стоимостью, названием и описанием.
Класс должен быть определен как неизменяемый (Immutable class).
Создайте класс Dish, описывающий посуду.
 */

public final class Drink {
    private final String name;
    private final double cost;
    private final String description;

    Drink(String name, double cost, String description) {
        this.name = name;
        this.cost = cost;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Напиток:\nНазвание: " + name + "\nСтоимость: " + cost + "\nОписание: '" + description;
    }
}
