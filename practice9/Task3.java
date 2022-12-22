package practice9;
import java.util.Arrays;
import java.util.Scanner;
/*
3. Напишите программу, которая объединяет два списка данных о
студентахв один отсортированный списках с использованием алгоритма
сортировки слиянием.
 */

public class Task3 {
    private static int i = 0;
    public static Student[] mergeSort(Student[] arr){
        Student[] buffer1 = Arrays.copyOf(arr, arr.length);
        Student[] buffer2 = new Student[arr.length];
        Student[] result = mergeSortInner(buffer1, buffer2, 0, arr.length);
        return result;
    }
    public static Student[] mergeSortInner(Student[] buffer1, Student[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1)
            return buffer1;
        int middle = startIndex + (endIndex - startIndex) / 2;
        Student[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        Student[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        Student[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex)
            result[destIndex++] = sorted1[index1].getID() < sorted2[index2].getID() ? sorted1[index1++] : sorted2[index2++];
        while (index1 < middle)
            result[destIndex++] = sorted1[index1++];
        while (index2 < endIndex)
            result[destIndex++] = sorted2[index2++];
        return result;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество студентов: ");
        int count = scanner.nextInt();
        Student[] students1 = new Student[count];
        Student[] students2 = new Student[count];
        String name;
        int ID;

        for(i = 0; i < count / 2; i++){
            System.out.println("Введите имя студента: ");
            name = scanner.next();
            System.out.println("Введите ID студента: ");
            ID = scanner.nextInt();
            Student student = new Student(name, ID);
            students1[i] = student;
        }

        for(int j = 0; j < count - i; j++){
            System.out.println("Введите имя студента: ");
            name = scanner.next();
            System.out.println("Введите ID студента: ");
            ID = scanner.nextInt();
            Student student = new Student(name, ID);
            students2[j] = student;
        }

        Student[] arr = new Student[count];
        int k = 0;
        for(int j = 0; j < count; j++){
            if(j < i)
                arr[j] = students1[j];
            else
                arr[j] = students2[k++];
        }

        Student[] result = mergeSort(arr);
        for(int j = 0; j < count; j++){
            System.out.println("Имя: " + result[j].getName() + "; ID: " + result[j].getID());
        }
    }
}