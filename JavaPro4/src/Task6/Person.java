package Task6;

import java.util.Objects;

public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int compareTo(Person o) {
        return age - o.age;
    }
}

