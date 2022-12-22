package practice20.Task1_3;

import java.io.Serializable;

/*
1. Создать обобщенный класс с тремя параметрами (T, V, K).
2. Класс содержит три переменные типа (T, V, K), конструктор,
принимающий на вход параметры типа (T, V, K), методы возвращающие
значения трех переменных. Создать метод, выводящий на консоль имена
классов для трех переменных класса.
3. Наложить ограничения на параметры типа: T должен
реализовать интерфейс Comparable (классы оболочки, String), V должен
реализовать интерфейс Serializable и расширять класс Animal, K
 */

public class GeneralClass <T extends Comparable, V extends Serializable, K extends Animal>{

    private T Compareble_first;
    private  V Serializeble_second;
    private K Animal_third;


    GeneralClass(T compareble_first, V Serializeble_second, K Animal_third){
        this.Compareble_first = compareble_first;
        this.Serializeble_second = Serializeble_second;
        this.Animal_third = Animal_third;
    }

    public T getCompareble_first(){
        return this.Compareble_first;
    }
    public V getSerializeble_second(){
        return this.getSerializeble_second();
    }

    public K getAnimal_third(){
        return this.getAnimal_third();
    }
    public void printClasses(){
        System.out.println("Первый класс: " + Compareble_first + " имеет тип данных " + Compareble_first.getClass().getName() + "\nВторой класс: " + Serializeble_second + " имеет тип данных " + Serializeble_second.getClass().getName() + "\nТретий класс: " + Animal_third + " имеет тип данных " + Animal_third.getClass().getName());
    }

    public static void main(String[] args){
        GeneralClass<String, Integer, Animal> temp = new GeneralClass<>("Some string", 100, new Animal());
        temp.printClasses();
    }
}
