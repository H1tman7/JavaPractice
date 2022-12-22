package practice20.Task1_3;

public class Animal {
    private String name, kind;
    Animal(){
        this.name = "Martin";
        this.kind= "Zebra";
    }
    @Override
    public String toString(){
        return kind + " по имени " + name;
    }
}
