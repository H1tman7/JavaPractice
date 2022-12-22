package practice3.task1_2;

public class TestTasks12 {
    public static void main(String[] args){

        Circle circle1 = new Circle(5, "красный", false);
        System.out.println(circle1.toString());

        Rectangle rectangle1 = new Rectangle(2.5, 15, "черный", true);
        System.out.println(rectangle1.toString());

        Square square1 = new Square(6, "зеленый", true);
        System.out.println(square1.toString());
        System.out.println(square1.width + " " + square1.length);
        square1.setSide(100);
        System.out.println(square1.width + " " + square1.length);
        square1.setWidth(2);
        System.out.println(square1.width + " " + square1.length);

    }
}