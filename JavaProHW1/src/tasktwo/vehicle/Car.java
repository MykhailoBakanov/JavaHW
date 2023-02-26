package tasktwo.vehicle;

import tasktwo.details.Engine;
import tasktwo.professions.Driver;

public class Car {
    String carBrand;
    String autoClass;
    String weightAuto;
    Driver driver;
    Engine engine;

    public Car(String carBrand, String autoClass, String weightAuto, Driver driver, Engine engine) {
        this.carBrand = carBrand;
        this.autoClass = autoClass;
        this.weightAuto = weightAuto;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Go !");
    }

    public void stop() {
        System.out.println("Stop !");
    }

    public void turnRight() {
        System.out.println("Turn Right !");
    }

    public void turnLeft() {
        System.out.println("Turn Left !");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", autoClass='" + autoClass + '\'' +
                ", weightAuto='" + weightAuto + '\'' +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}

