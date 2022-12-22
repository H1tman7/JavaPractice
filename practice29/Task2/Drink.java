package practice29.Task2;

public final class Drink implements Item{
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
