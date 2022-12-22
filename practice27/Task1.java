package practice27;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
1.	Преобразовать структуру данных HashSet в структуру TreeSet
 */

public class Task1 {
    public static <T> Set<T> getInstance(Set<T> hashSet) {
        return new TreeSet<T>(hashSet);
    }

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("5");
        hashSet.add("10");
        hashSet.add("150");
        hashSet.add("5");
        Set<String> treeSet = getInstance(hashSet);
        System.out.println(treeSet);
    }
}
