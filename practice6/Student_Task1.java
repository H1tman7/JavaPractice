package practice6;

class Student_Task1 implements Comparable<Student_Task1> {
    public String Name;
    public int iDNumber;

    Student_Task1(String Name, int iDNumber) {
        this.Name = Name;
        this.iDNumber = iDNumber;
    }

    public String toString() {
        return Name + iDNumber;
    }

    public String getName() {
        return Name;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    @Override
    public int compareTo(Student_Task1 student) {
        if (this.iDNumber > student.iDNumber) {
            return 1;
        } else {
            return 0;
        }
    }
}
