package practice10;
import java.util.Scanner;
import java.util.ArrayList;

/*
2. Напишите класс SortingStudentsByGPA (может у вас называться
Tester или Main, так как содержит функцию main()) создайте поле как
массив объектов Student с названием iDNumber, вы можете использовать
как массив, так и и ArrayList или TreeSet для хранения данных о студентах
Добавьте методы класса: 1) заполнения массива setArray() 2) метод для
сортировки по среднему баллу студентов quicksort() который реализует
интерфейс Comparator таким образом, чтобы он сортировал студентов с их
итоговым баллом. В качестве алгоритма сортировки
использовать методы сортировок: слиянием и быструю сортировку
(добавьте в класс еще один метод). 3)метод для вывода массива студентов
outArray()
4)Добавьте в класс возможность сортировать список студентов по другому
полю
 */

public class Task2 {
    Scanner scanner = new Scanner(System.in);
    public static Student[] setArray(){
        Student[] arr = new Student[5];
        return new Student[]{
                new Student("Александр", "Гордеев", "ФИИТ", 3, "ИТО-01"),
                new Student("Михаил", "Андреев", "Прог.инж.", 2, "ИКБО-04"),
                new Student("Владислав", "Мурзин", "Истфак", 1, "ПОС-26"),
                new Student("Дмитрий", "Гордон", "прик.инф.", 2, "ИНБО-01"),
                new Student("Тарас", "Кристаллов", "инфобез", 5, "ИКОНЯ-10")
        };
    }

    private static final SortingByAnyField temp = new SortingByAnyField();
    public static void quickSort(Object[] array, int high, int low, String field){
        if(array == null || array.length == 0) return;
        if(high <= low) return;
        Object middle = array[(low + high)/2];
        ArrayList<Object> left = new ArrayList<>();
        ArrayList<Object> right = new ArrayList<>();
        ArrayList<Object> eq = new ArrayList<>();
        for(int i = low; i <= high; i++){
            if(temp.compareTo(array[i], middle, field) > 0)
                right.add(array[i]);
            else if (temp.compareTo(array[i], middle, field) < 0)
                left.add(array[i]);
            else eq.add(array[i]);
        }
        Object[] leftArr;
        Object[] rightArr;
        if(left.size()>0) {
            leftArr = left.toArray();
            quickSort(leftArr, left.size() - 1, 0, field);
            System.arraycopy(leftArr, 0, array, low, left.size());
        }
        System.arraycopy(eq.toArray(), 0, array, low+left.size(), eq.size());

        if(right.size() > 0) {
            rightArr = right.toArray();
            quickSort(rightArr, right.size() - 1, 0, field);
            System.arraycopy(rightArr, 0, array, low+left.size() + eq.size(), right.size());
        }
    }
    public static void mergeSort(Student[] arr, int n, String field) {
        if (n < 2)
            return;
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        System.arraycopy(arr, 0, l, 0, mid);
        System.arraycopy(arr, mid, r, 0, n - mid);
        mergeSort(l, mid, field);
        mergeSort(r, n - mid, field);

        merge(arr, l, r, mid, n - mid, field);
    }
    public static void merge(Student[] a, Student[] l, Student[] r, int left, int right, String field){
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (temp.compareTo(l[i], r[j], field) <= 0)
                a[k++] = l[i++];
            else
                a[k++] = r[j++];
        }
        while (i < left)
            a[k++] = l[i++];
        while (j < right)
            a[k++] = r[j++];
    }
    public static void outArray(Student[] arr){
        for (Student s : arr){
            System.out.println(s.toString());
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Заполнение массива заготовленными данными.");
        Student[] iDNumber = setArray();
        outArray(iDNumber);
        System.out.println("Сортировка массива.\nВведите поле, по которому нужно сортировать:(name, surname, spec, course, group)");
        String field = scanner.next();
        quickSort(iDNumber,iDNumber.length - 1, 0, field);
        System.out.println("Массив, отсортированный методом quickSort.");
        outArray(iDNumber);
        System.out.println("\nВторой массив");
        Student[] iDNumber2 = setArray();
        outArray(iDNumber2);
        System.out.println("Сортировка массива.\nВведите поле, по которому нужно сортировать:(name, surname, spec, course, group)");
        field = scanner.next();
        mergeSort(iDNumber2, iDNumber2.length, field);
        System.out.println("Второй массив, отсортированный методом mergeSort.");
        outArray(iDNumber2);

        /*
        3. Напишите программу, которая объединяет два списка данных о
        студентах в один отсортированный списках.
         */

        System.out.println("\n\nСоздадим объединенный массив");
        Student[] concatenatedArray = new Student[iDNumber.length + iDNumber2.length];
        System.arraycopy(iDNumber, 0, concatenatedArray, 0,  iDNumber.length);
        System.arraycopy(iDNumber2, 0, concatenatedArray, iDNumber.length, iDNumber2.length);
        outArray(concatenatedArray);
        System.out.println("Сортировка массива.\nВведите поле, по которому нужно сортировать:(name, surname, spec, course, group)");
        field = scanner.next();
        quickSort(concatenatedArray,concatenatedArray.length - 1, 0, field);
        System.out.println("Объединенный массив, отсортированный методом quickSort.");
        outArray(concatenatedArray);
    }
}