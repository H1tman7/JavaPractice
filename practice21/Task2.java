package practice21;
import java.util.Arrays;
/*
2. Написать класс, который умеет хранить в себе массив любых
типов данных (int, long etc.)
 */
public class Task2 <T>{
    private T[] arr;
    private int count;
    private int size;

    public Task2(){
        this.size = 5;
    }

    public Task2(int size) {
        this.size = size;
        arr = (T[]) new Object[size];
        count = 0;
    }

    public T getElement(int index){
        if(index > count)
            throw new IndexOutOfBoundsException("Размер данного массива: " + this.count + ", Введенный индекс: " + index);
        return arr[index];
    }

    @Override
    public String toString() {
        return "Созданной массив:\nСписок элементов: " + Arrays.toString(arr);
    }

    public void add(T obj){
        arr[count++] = obj;
    }
}