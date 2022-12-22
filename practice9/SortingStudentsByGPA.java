package practice9;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b){
        if(a.getGPA() < b.getGPA()) {
            return -1;
        }
        else if(a.getGPA() > b.getGPA())
            return 1;
        else
            return 0;
    }
}

