package practice9;

/*
4. Напишите свою собственную реализацию интерфейса
Comparable
 */

public class Comparable_Realization implements Comparable<Comparable_Realization>{
    private String name;
    Comparable_Realization(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }

    @Override
    public int compareTo(Comparable_Realization p){
        return name.compareTo(p.getName());
    }
}
