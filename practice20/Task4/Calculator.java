package practice20.Task4;
/*
Написать класс Калькулятор
(необобщенный), который содержит обобщенные статические методы -
sum, multiply, divide, subtraction. Параметры этих методов - два числа
разного типа, над которыми должна быть произведена операция
 */
public class Calculator {
    public static <T extends Number, V extends Number> void sum(T num1, V num2){
        System.out.println(num1.doubleValue() + num2.doubleValue());
    }
    public static<T extends Number, V extends Number> void substraction(T num1, V num2){
        System.out.println(num1.doubleValue() - num2.doubleValue());
    }
    public static<T extends Number, V extends Number> void multiply(T num1, V num2){
        System.out.println(num1.doubleValue() * num2.doubleValue());
    }
    public static<T extends Number, V extends Number> void divide(T num1, V num2){
        System.out.println(num1.doubleValue() / num2.doubleValue());
    }

    public static void main(String[] args){
        Integer int1 = 3, int2 = 1;
        Calculator.sum(int1, int2);
        Calculator.substraction(int1, int2);
        Calculator.multiply(int1, int2);
        Calculator.divide(int1, int2);

        System.out.println("\n\n");
        Integer int3 = 15;
        Double double1 = 3.3;
        Calculator.sum(int3, double1);
        Calculator.substraction(int3, double1);
        Calculator.multiply(int3, double1);
        Calculator.divide(int3, double1);
    }

}
