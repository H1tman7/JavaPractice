package pracitce11;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/*
Задание 5.
Сравнить время выполнения кода в реализации кода в виде различных
структур данных из предыдущих заданий (сравнить ArrayList и LinkedList
по производительности – операции вставки, удаления, добавления и поиска
по образцу)
 */

public class Task5 {
    public static int size = 10000;
    public static ArrayList<Integer> createArrayList(){
        ArrayList<Integer> ans = new ArrayList<>(size);
        for (int i = 0; i < size; ++i)
            ans.add(i, i + 1);
        return ans;
    }

    public static LinkedList<Integer> createLinkedList(){
        LinkedList<Integer> ans = new LinkedList<>();
        for (int i = 0; i < size; ++i)
            ans.add(i + 1);
        return ans;
    }



    public static void main(String[] args) throws ParseException {
        long start = System.nanoTime();
        ArrayList<Integer> arrayList = createArrayList();
        System.out.println("На то, чтобы создать ArrayList и добавить в него 10 элементов, затрачено " + (System.nanoTime() - start) + " наносекунд");

        start = System.nanoTime();
        LinkedList<Integer> linkedList = createLinkedList();
        System.out.println("На то, чтобы создать LinkedList и добавить в него 10 элементов, затрачено " + (System.nanoTime() - start) + " наносекунд");

        start = System.nanoTime();
        arrayList.remove(7);
        System.out.println("На удаление элемента из ArrayList затрачено " + (System.nanoTime() - start) + " наносекунд");

        start = System.nanoTime();
        linkedList.remove(7);
        System.out.println("На удаление элемента из LinkedList затрачено " + (System.nanoTime() - start) + " наносекунд");

        start = System.nanoTime();
        arrayList.add(1, 100);
        System.out.println("На добавление в ArrayList элемента затрачено " + (System.nanoTime() - start) + " наносекунд");

        start = System.nanoTime();
        linkedList.add(1, 100);

        System.out.println("На добавление в LinkedList элемента затрачено " + (System.nanoTime() - start)  + " наносекунд");
    }
}
