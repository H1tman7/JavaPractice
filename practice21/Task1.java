package practice21;
import java.io.File;
import java.nio.file.Paths;
import java.util.*;

public class Task1 {

    //3. Реализовать метод, который возвращает любой элемент массива по индексу.
    public static <T> T getArray(T[] arr, int i){
        if (i < 0 || i >= arr.length)
            throw new IndexOutOfBoundsException("Размер данного массива: " + arr.length + ", Введенный индекс: " + i);
        return arr[i];
    }

    //4. Написать функцию, которая сохранит содержимое каталога в
    //список и выведет первые 5 элементов на экран.
    public static ArrayList<File> PathManager(String path){
        File file = new File(path);
        if (!file.exists() || !file.isDirectory())
            throw new IllegalArgumentException("Некорректный путь");
        ArrayList<File> file_path = new ArrayList<File>();
        Collections.addAll(file_path, Objects.requireNonNull(file.listFiles()));
        try{
            for (int i = 0; i < 5; i++)
                System.out.println(file_path.get(i).getName());
        }catch (Exception e) {
            System.out.println("В данном каталоге меньше 5 файлов");
        }
        return file_path;
    }

    public static void main(String[] args) throws Exception {
        String[] temp = new String[]{"Hello", "World", "!"};
        System.out.println("\nЗадание 2. Написать класс, который умеет хранить в себе массив любых типов данных");
        Task2 <Integer> integer_ = new Task2<>(10);
        for(Integer i = 0; i<10;i++)
            integer_.add(i);
        System.out.println(integer_);
        System.out.println("В списке integer_ с индексом 5 находится элемент: " + integer_.getElement(5) + "\n");

        Task2<String> string_ = new Task2<>(10);
        for (int i = 0; i < 10; i++)
            string_.add("string " + (i+1));
        System.out.println(string_);
        System.out.println("В списке string_ с индексом 5 находится элемент: " + string_.getElement(5) + "\n");

        System.out.println("\nЗадание 3. Реализовать метод, который возвращает любой элемент массива по индексу");
        System.out.println("В списке temp с индексом 1 находится элемент: " + getArray(temp, 1));

        System.out.println("\nЗадание 4. Написать функцию, которая сохранит содержимое каталога в список и выведет первые 5 элементов на экран");
        ArrayList <File> files = PathManager(Paths.get("D:\\").toAbsolutePath().toString());
        System.out.println();
        System.out.println(files + "\n");
    }
}
