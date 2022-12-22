package practice9;
public class Student{
    private String name;
    private int ID;
    private double GPA;

    Student(String name, String surname, String spec, int ID, String group){
        this.ID = ID;
        this.name = name;
    }

    Student(String name, int ID){
        this.name = name;
        this.ID = ID;
    }

    Student(String name, double GPA){
        this.name = name;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString(){
        return "Имя: " + name + "; Средняя оценка: " + getGPA();
    }

}

