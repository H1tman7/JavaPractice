package practice29.Task3;

public final class Dish implements Item {
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
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public double getCost(){
        return this.cost;
    }
    @Override
    public String getDescription(){
        return this.description;
    }
}