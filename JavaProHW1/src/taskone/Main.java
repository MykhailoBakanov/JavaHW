package taskone;

import taskone.Student;

public class Main {
    public static void main(String[] args) {

        Student[] students = {
                new Student("Mykhailo", "Bakanov", "105", 4),
                new Student("Leonid", "Koziavko", "105", 5),
                new Student("Maksim", "Bushchuk", "105", 3),
                new Student("Denis", "Varankin", "105", 4),
                new Aspirant("Petro", "Poroshenko", "505", 5),
                new Aspirant("Luda", "Ivanova", "505", 2),
        };

        for (Student student : students) {
            System.out.println(student.getScholarship());
        }
    }
}

