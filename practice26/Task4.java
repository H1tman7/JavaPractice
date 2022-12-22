package practice26;
import java.util.PriorityQueue;

/*
На Set Протестировать созданные функции – создать очередь с приоритетом
из 10 элементов. Извлечь и вывести на экран значения нескольких элементов.
 */

public class Task4{
    public static void main(String[] args) {
        PriorityQueue <Integer> a = new PriorityQueue<>();
        for (int i = 0; i < 10; ++i)
            a.add(i);
        for(int i = 0; i < 5; i++){
            System.out.println(a.poll());
        }
    }
}