package practice3.task1_2;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){
        color = "белый";
        filled = true;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public boolean isFilled(){
        return filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String toString();

}
