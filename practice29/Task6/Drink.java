package practice29.Task6;

public class Drink implements Item{
    private final String name;
    private final double cost;
    private final String description;

    Drink(String name, double cost, String description) {
        if (cost < 0 || name == null || description == null || name=="" || description=="") {
            throw new IllegalArgumentException("Нельзя создать объект с такими аргументами");
        }
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Напиток:\nНазвание: " + name + "\nСтоимость: " + cost + "\nОписание: '" + description;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
