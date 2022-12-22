package practice3.task1_2;

public class Circle extends Shape {
    protected double radius;

    public Circle(){
        radius = 10;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter(){
        return Math.PI * radius * 2;
    }

    @Override
    public String toString(){
        return "Круг имеет " + color + " цвет, его площадь: " + getArea() + ", а периметр: " + getPerimeter();
    }

}
