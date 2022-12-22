package practice20.Task4;
/*
4. Написать обобщенный класс MinMax, который содержит
методы для нахождения минимального и максимального элемента
массива. Массив является переменной класса. Массив должен
передаваться в класс через конструктор.
 */
public class MinMax<T extends Comparable<T>> {

    private T[] arr;
    MinMax(T[] array){
        this.arr = array;
    }

    T getMax(){
        T max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max.compareTo(arr[i]) < 0){
                max = arr[i];
            }
        }
        return max;
    }

    T getMin(){
        T min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(min.compareTo(arr[i]) > 0){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args){
        Double[] doubles = new Double[]{5.5, 3.2, 7.8};
        Integer[] integers = new Integer[]{5, 3, 2, 19};

        MinMax<Double> mm_double = new MinMax<>(doubles);
        System.out.println("min in Double array: " + mm_double.getMin() + " max in Double array: " +  mm_double.getMax());
        MinMax<Integer> mm_integers = new MinMax<>(integers);
        System.out.println("min in Integer array: " + mm_integers.getMin() + " max in Integer array: " +  mm_integers.getMax());
    }
}
