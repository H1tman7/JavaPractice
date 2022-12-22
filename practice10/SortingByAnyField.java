package practice10;

public class SortingByAnyField {
    public int compareTo(Object obj1, Object obj2, String field) {
        switch (field) {
            case "name":
                String name1 = ((Student) obj1).getName();
                String name2 = ((Student) obj2).getName();
                return name1.compareTo(name2);
            case "surname":
                String surname1 = ((Student) obj1).getSurname();
                String surname2 = ((Student) obj2).getSurname();
                return surname1.compareTo(surname2);
            case "course":
                return ((Student) obj1).getCourse() - ((Student) obj2).getCourse();
            case "spec":
                String job1 = ((Student) obj1).getSpec();
                String job2 = ((Student) obj2).getSpec();
                return job1.compareTo(job2);
            case "group":
                String gr1 = ((Student) obj1).getGroup();
                String gr2 = ((Student) obj2).getGroup();
                return gr1.compareTo(gr2);
            default:
                return 1337;
        }
    }

}
