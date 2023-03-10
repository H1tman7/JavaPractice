package practice30;

public class MenuItem {
    public MenuItem(int cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    private int cost;
    private String name;
    private String description;

    @Override
    public String toString() {
        return getName();
    }
}
