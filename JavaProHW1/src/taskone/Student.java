package taskone;

public class Student {
    String firstName;
    String lastName;
    String group;

    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }


    public int getScholarship() {
        if (this.averageMark == 5) {
            return 2000;
        } else {
            return 1900;
        }
    }
}

