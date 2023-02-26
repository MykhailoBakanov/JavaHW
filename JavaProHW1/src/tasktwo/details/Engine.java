package tasktwo.details;

public class Engine {
    String powerOfMotor;
    String producer;

    public Engine(String powerOfMotor, String producer) {
        this.powerOfMotor = powerOfMotor;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "powerOfMotor='" + powerOfMotor + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
