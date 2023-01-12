package ru.pflb;

import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;
import ru.pflb.vehicles.Car;
import ru.pflb.vehicles.Lorry;
import ru.pflb.vehicles.SportCar;
import ru.pflb.vehicles.VehicleClass;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(150, "Toyota");
        Driver driver = new Driver(45, "Федоров Иван Петрович", 24, 145577);
        Car car = new Car("Camry", VehicleClass.EXECUTIVE, 2000, driver, engine);
        System.out.println(car);
        Engine engine1 = new Engine(350,"Volvo");
        Driver driver1 = new Driver(34, "Сидоров Петр МИхайлович", 13, 452211);
        Lorry lorry = new Lorry("VNL670", VehicleClass.LARGE, 10000, driver1, engine1, 20000);
        System.out.println(lorry);
        Engine engine2 = new Engine(650, "Ferrari");
        Driver driver2 = new Driver(37, "Иванов Дмитрий Сергеевич", 17, 454811);
        SportCar sportCar = new SportCar("F8", VehicleClass.SPORTS_CAR, 1500, driver2, engine2, 340);
        System.out.println(sportCar);


    }
}
