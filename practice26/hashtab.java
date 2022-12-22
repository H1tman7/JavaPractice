package practice26;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;
import static java.lang.Math.abs;

/*
Задание 3 Продемонстрировать поиск элемента по ключу и удаление элемента.
 */

public class hashtab {
    private class Node{
        private final String key;
        private final String value;
        Node(String key, String value){
            this.key = key;
            this.value = value;
        }
    }
    int size;
    ArrayList <LinkedList<Node>> hashTab;
    public void initTable(int size){
        this.size = size;
        hashTab = new ArrayList<>(size);
    }
    public int HashFunc(String key){
        return abs(key.hashCode() % size);
    }
    public void addNew(String key, String value){
        int index = HashFunc(key);
        Node element = new Node(key, value);
        LinkedList <Node> tmp;
        try{
            tmp = hashTab.remove(index);
            tmp.add(element);
        }catch (IndexOutOfBoundsException ingnored){
            tmp = new LinkedList<>();
            tmp.add(element);
        }
        hashTab.add(index, tmp);
    }
    public String searchByKey(String key){
        int index = HashFunc(key);
        try{
            LinkedList<Node> tmp = hashTab.get(index);
            for (Node x: tmp)
                if (Objects.equals(x.key, key))
                    return x.value;
            return "Такого элемента не существует";
        }
        catch (IndexOutOfBoundsException ignored){
            return "Такого элемента не существует";
        }
    }
    public String remove(String key){
        int index = HashFunc(key);
        LinkedList<Node> tmp = hashTab.remove(index);
        String ans = "Такого элемента не существует";
        for (Node x: tmp)
            if (Objects.equals(x.key, key)){
                ans = x.value;
                tmp.remove(x);
                break;
            }
        hashTab.add(index, tmp);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        hashtab table = new hashtab();
        System.out.print("Введите количество элементов: ");
        int count = scanner.nextInt();
        table.initTable(count);
        System.out.println(count);
        String new_line;
        scanner.nextLine();
        for (int i = 0; i < count; i++){
            System.out.print("Введите ключ и значение через пробел: ");
            new_line = scanner.nextLine();
            String[] temp = new_line.split(" ");
            table.addNew(temp[0], temp[1]);
        }
        System.out.print("Введите ключ, который хотите найти в словаре: ");
        String key = scanner.next();
        String value = table.searchByKey(key);
        System.out.println("Значение ключа: " + value);
        System.out.print("Введите ключ, который хотите удалить из словаря: ");
        key = scanner.next();
        value = table.remove(key);
        System.out.println("Ключ " + value + " удален" );
    }
}
