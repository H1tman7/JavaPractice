package practice9;
import java.util.Scanner;
/*
1. Написать тестовый класс, который создает массив класса
Student и сортирует массив iDNumber и сортирует его вставками.
 */

public class Task1 {
    public static void insertionSort(int[] arr) {
        int j;
        //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
        for (int i = 1; i < arr.length; i++) {
            //сохраняем ссылку на индекс предыдущего элемента
            int swap = arr[i];
            for (j = i; j > 0 && swap < arr[j - 1]; j--) {
                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                arr[j] = arr[j - 1];
            }
            arr[j] = swap;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество студентов: ");
        int count = scanner.nextInt();
        Student[] students = new Student[count];
        int[] iDNumber = new int[count];
        String name;
        int ID;
        for(int i = 0; i < count; i++){
            System.out.println("Введите имя студента: ");
            name = scanner.next();
            System.out.println("Введите ID студента: ");
            ID = scanner.nextInt();
            Student student = new Student(name, ID);
            students[i] = student;
            iDNumber[i] = students[i].getID();
        }

        System.out.println("Сортировка массива вставками");
        insertionSort(iDNumber);

        for(int i = 0; i < count; i++){
            System.out.println(iDNumber[i]);
        }
    }
}

