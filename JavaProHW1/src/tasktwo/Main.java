package tasktwo;

import tasktwo.details.Engine;
import tasktwo.professions.Driver;
import tasktwo.vehicle.Car;

public class Main {

    public static void main(String[] args) {

        Engine engine = new Engine("280", "volvo");
        Driver driver = new Driver("Mykhailo Bakanov MYkhailovich", "Warcislawa 8", "21.11.2001", "0");
        Car car = new Car("ferarri ", "C", "1300Kg", driver, engine);

        System.out.println(car);
    }

}
