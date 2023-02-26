package tasktwo.professions;

public class Person {
    String firstLastMiddleName;
    String address;
    String birthDay;

    public Person(String firstLastMiddleName, String address, String birthDay) {
        this.firstLastMiddleName = firstLastMiddleName;
        this.address = address;
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstLastMiddleName='" + firstLastMiddleName + '\'' +
                ", address='" + address + '\'' +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }
}
