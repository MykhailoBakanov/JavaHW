package taskone;

import taskone.Student;

public class Aspirant extends Student {

    boolean scientificWork = true;

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public int getScholarship() {
        if (this.averageMark == 5) {
            return 2500;
        } else {
            return 2200;
        }
    }
}



