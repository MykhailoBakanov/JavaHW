package tasktwo.professions;

public class Driver extends Person{
    String drivingExperience;

    public Driver(String firstLastMiddleName, String address, String birthDay, String drivingExperience) {
        super(firstLastMiddleName, address, birthDay);
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "firstLastMiddleName='" + firstLastMiddleName + '\'' +
                ", address='" + address + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", drivingExperience='"+ drivingExperience +
                '}';
    }
}
