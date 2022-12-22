package practice7.task3;
/*
3. Добавьте в класс параметризированные конструкторы,
входящие в состав классов; метод в классах для перевода числовых
значений в Строку. Убедитесь, что две точки имеют одну и ту же скорость
при помощи специального логического метода SpeedTest(), проверяющего
это.
 */

public class Task3 {
    static <T> String numToString(T x){
        return "" + x;
    }
    public static void main(String[] args){
        MovableRectangle rectangle = new MovableRectangle(2, 5, 5, 2, 2, 3);
        System.out.println(rectangle.toString());
        System.out.println("SpeedTest = " + rectangle.SpeedTest());
        double dbl = 5.5;
        Integer inta = 1;
//        System.out.println(numToString(dbl));
//        System.out.println(numToString(inta));
//        System.out.println(inta + " is of type " + ((Object)inta).getClass().getSimpleName());
    }
}