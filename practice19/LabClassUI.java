package practice19;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class LabClassUI{
    private static final SortingStudentsByGPA temp = new SortingStudentsByGPA();
    public static void quickSort(Object[] array, int high, int low){
        if(array == null || array.length == 0) return;
        if(high <= low) return;
        Object middle = array[(low + high)/2];
        ArrayList<Object> left = new ArrayList<>();
        ArrayList<Object> right = new ArrayList<>();
        ArrayList<Object> eq = new ArrayList<>();
        for(int i = low; i <= high; i++){
            if(temp.compare((Student)array[i], (Student)middle) > 0)
                right.add(array[i]);
            else if (temp.compare((Student)array[i], (Student)middle) < 0)
                left.add(array[i]);
            else eq.add(array[i]);
        }
        Object[] leftArr;
        Object[] rightArr;
        if(left.size()>0) {
            leftArr = left.toArray();
            quickSort(leftArr, left.size() - 1, 0);
            System.arraycopy(leftArr, 0, array, low, left.size());
        }
        System.arraycopy(eq.toArray(), 0, array, low+left.size(), eq.size());

        if(right.size() > 0) {
            rightArr = right.toArray();
            quickSort(rightArr, right.size() - 1, 0);
            System.arraycopy(rightArr, 0, array, low+left.size() + eq.size(), right.size());
        }
    }
    public static Student findStudent(Student[] all, String name, String surname) throws StudentNotFound {
        for (Student x: all){
            if (Objects.equals(x.getName(), name) && Objects.equals(x.getSurname(), surname))
                return x;
        }
        throw new StudentNotFound("Такого студента нет");
    }

    public static void outArray(Student[] arr){
        for (Student s : arr){
            System.out.println(s.toString());
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество студентов: ");
        int count = scanner.nextInt();
        String name,surname, spec, group;
        double GPA;
        int course;
        Student[] students = new Student[count];

        for(int i = 0; i < count; i++){
            System.out.print("Введите имя студента: ");
            name = scanner.nextLine();
            if(name == "")
                try{
                    throw new EmptyStringException("Введена пустая строка");
                }catch (EmptyStringException ese){
                    System.out.println("Вы ввели пустую строку. Попробуйте снова");
                    i--;
                    continue;
                }
            System.out.print("Введите фамилию студента: ");
            surname = scanner.nextLine();
            if(Objects.equals(surname, ""))
                try{
                    throw new EmptyStringException("Введена пустая строка");
                }catch (EmptyStringException ese){
                    System.out.println("Вы ввели пустую строку. Попробуйте еще раз");
                    i--;
                    continue;
                }

            System.out.print("Введите направление студента: ");
            spec = scanner.next();
            System.out.print("Введите номер курса студента: ");
            course = scanner.nextInt();
            System.out.print("Введите название группы студента: ");
            group = scanner.next();

            System.out.print("Введите средний балл студента: ");
            try{
                GPA = scanner.nextDouble();
                students[i] = new Student(name, surname, spec, course, group, GPA);
            }
            catch(NumberFormatException nfe){
                System.out.println("Введено неверное число. Попробуйте еще раз");
                i--;
            }
            System.out.println("");
        }

        String find_name, find_surname;
        int choice;
        while(true){
            System.out.println("Введите действие(1 - вывести массив на экран, 2 - отсортировать массив по среднему баллу, 3 - выполнить поиск студента по имени");
            choice = scanner.nextInt();
            if(choice == 1){
                outArray(students);
            }
            else if(choice == 2){
                System.out.println("Сортировка массива по среднему баллу");
                quickSort(students,students.length - 1, 0);
                System.out.println("Массив отсортирован методом quickSort.");
            }
            else if(choice == 3){
                System.out.print("Введите имя студента, которого хотите найти: ");
                find_name = scanner.next();
                if (Objects.equals(find_name, "")){
                    try {
                        throw new EmptyStringException("Введена пустая строка");
                    }catch (EmptyStringException ese) {
                        System.out.println("Вы ввели пустую строку. Попробуйте еще раз");
                    }
                }
                System.out.print("Введите фамилию студента, которого хотите найти: ");
                find_surname = scanner.next();
                if (Objects.equals(find_surname, "")){
                    try {
                        throw new EmptyStringException("Введена пустая строка");
                    }
                    catch (EmptyStringException ese) {
                        System.out.println("Вы ввели пустую строку. Попробуйте еще раз");
                    }
                }
                try{
                    Student answer = findStudent(students, find_name, find_surname);
                    System.out.println(answer.toString());
                }catch(StudentNotFound snf){
                    System.out.println("Студент не найден");
                }
            }
            else
                break;
        }
    }
}
