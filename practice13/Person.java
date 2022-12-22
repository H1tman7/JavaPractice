package practice13;

/*
Задание 2. (5%) Разработать класс Person, в котором имеется
функция, возвращающая Фамилию И.О. Функция должна учитывать
возможность отсутствия значений в полях Имя и Отчество. Программу
оптимизировать с точки зрения быстродействия.
 */

public class Person {
    private String name, surname, patronymic;
    public Person(String surname) {
        this.surname = surname;
    }
    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }
    public String getFIO(){
        StringBuilder stringBuilder = new StringBuilder(surname);
        if(name != null && !name.equals(""))
            stringBuilder.append(" ").append(name);
        if(patronymic != null && ! patronymic.equals(""))
            stringBuilder.append(" ").append(patronymic);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Person p1 = new Person("Чечушков");
        Person p2 = new Person("Михаил", "Чечушков", "");
        Person p3 = new Person("Михаил", "Чечушков", "Андреевич");
        System.out.println(p1.getFIO());
        System.out.println(p2.getFIO());
        System.out.println(p3.getFIO());
    }
}