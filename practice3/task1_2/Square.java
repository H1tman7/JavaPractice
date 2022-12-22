package practice3.task1_2;

public class Square extends Rectangle {

    public Square(){
        this.length = 7.7;
    }

    public Square(double side){
        this.width = this.length = side;
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
        this.width = this.length = side;
    }

    public double getSide(){
        return length;
    }

    public void setLength(double side){
        this.width = this.length = side;
    }

    public void setWidth(double side){
        this.width = this.length = side;
    }

    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }

    @Override
    public String toString(){
        return "Квадрат имеет " + color + " цвет, его площадь: " + getArea() + ", а периметр: " + getPerimeter();
    }

}
