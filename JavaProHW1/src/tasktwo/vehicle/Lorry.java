package tasktwo.vehicle;

import tasktwo.details.Engine;
import tasktwo.professions.Driver;

public class Lorry extends Car{
    String bodyLoadCapacity;

    public Lorry(String carBrand, String autoClass, String weightAuto, Driver driver, Engine engine, String bodyLoadCapacity) {
        super(carBrand, autoClass, weightAuto, driver, engine);
        this.bodyLoadCapacity = bodyLoadCapacity;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "bodyLoadCapacity='" + bodyLoadCapacity + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", autoClass='" + autoClass + '\'' +
                ", weightAuto='" + weightAuto + '\'' +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
