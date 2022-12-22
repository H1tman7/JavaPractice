package practice29.Task1;

public final class Dish {
    private final String name;
    private final double cost;
    private final String description;

    Dish(String name,double cost, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Блюдо:\nНазвание: " + name + "\nСтоимость: " + cost + "\nОписание: '" + description;
    }
}
