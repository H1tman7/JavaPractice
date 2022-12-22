package practice10;

/*
1. Создать свой класс Student со всеми переменными экземпляра,
конструктором, включающим все переменные, предпочтительно
использовать геттеры и сеттеры для каждой переменной. Класс студент
имеет свойства: Имя, Фамилия, Специальность, Курс, Группа
 */

public class Student {
    private String name;
    private String surname;
    private String spec;
    private int course;
    private String group;

    public Student(String name, String surname, String spec, int course, String group){
        this.name = name;
        this.surname = surname;
        this.spec = spec;
        this.course = course;
        this.group = group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSpec() {
        return spec;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString(){
        return "Студент: " + getName() + " " + getSurname() + " учится на " + getCourse() + " курсе в группе " + getGroup() + " на направлении " + getSpec();
    }

}

