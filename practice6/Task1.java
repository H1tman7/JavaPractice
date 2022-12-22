package practice6;
import java.util.*;
import java.util.Collections;

public class Task1 extends ArrayList<Student_Task1> {

    public static int[] insertionSort(int[] array) {

        return array;
    }

    private static ArrayList CreateStudentList() {
        ArrayList<Student_Task1> list1 = new ArrayList<Student_Task1>();

        String Name;
        int iDNumber;
        int[] id_arr = new int[100];
        for(int i = 0; i < 100; i++){
            id_arr[i] = 0;
        }

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Count of students: ");
        int StudentsCount = s.nextInt();

        for (int i = 0; i < StudentsCount; i++) {
            System.out.println("Enter name № " + (i + 1));
            Name = s.next();
            System.out.println("Enter iDNumber №" + (i + 1));
            iDNumber = s.nextInt();
            id_arr[i] = iDNumber;
            list1.add(new Student_Task1(Name, iDNumber));
        }



        Collections.sort(list1);
        for (Student_Task1 obj : list1) {
            System.out.println(obj);
        }

//        insertionSort(id_arr);

        return list1;
    }

    public static void main(String[] args) {
        ArrayList list = CreateStudentList();
/*        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }*/

/*
        for(int i = 0; i < StudentsCount; i++){
            System.out.println((list1.getLast()).getiDNumber());
        }
*/

    }
}
