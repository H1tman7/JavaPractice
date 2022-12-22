package practice9;
import java.util.Scanner;

/*
2. Напишите класс SortingStudentsByGPA который реализует
интерфейс Comparator таким образом, чтобы сортировать список студентов
по их итоговым баллам в порядке убывания с использованием алгоритма
быстрой сортировки
 */

public class Task2 {

    public static void quickSort(Student[] arr, int low, int high) {
        //завершить,если массив пуст или уже нечего делить
        if (arr.length == 0 || low >= high) return;

        //выбираем опорный элемент
        int middle = low + (high - low) / 2;
        Student border = arr[middle];

        //разделияем на подмассивы и меняем местами
        int i = low, j = high;
        while (i <= j) {
            while (arr[i].getGPA() < border.getGPA()) {
                i++;
            }
            while (arr[j].getGPA() > border.getGPA()) {
                j--;
            }
            if (i <= j) {
                Student swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
                j--;
            }
        }

        //рекурсия для сортировки левой и правой части
        if (low < j) quickSort(arr, low, j);
        if (high > i) quickSort(arr, i, high);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество студентов: ");
        int count = scanner.nextInt();
        Student[] students = new Student[count];
        String name;
        double GPA;
        for (int i = 0; i < count; i++) {
            System.out.println("Введите имя студента: ");
            name = scanner.next();
            System.out.println("Введите GPA студента: ");
            GPA = scanner.nextDouble();
            Student student = new Student(name, GPA);
            students[i] = student;
        }

        System.out.println("Сортировка массива студентов по итоговым баллам");
        quickSort(students, 0, students.length - 1);

        for (int i = count - 1; i >= 0; i--) {
            System.out.println(students[i].toString());
        }
    }
}