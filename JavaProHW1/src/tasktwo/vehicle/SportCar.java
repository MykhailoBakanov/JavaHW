package tasktwo.vehicle;

import tasktwo.details.Engine;
import tasktwo.professions.Driver;

public class SportCar extends Car{
    String maxSpeed;

    public SportCar(String carBrand, String autoClass, String weightAuto, Driver driver, Engine engine, String maxSpeed) {
        super(carBrand, autoClass, weightAuto, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed='" + maxSpeed + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", autoClass='" + autoClass + '\'' +
                ", weightAuto='" + weightAuto + '\'' +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
