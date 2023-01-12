package ru.pflb.vehicles;

import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;

public class Car {
    String model;
    VehicleClass vehicleClass;
    int weigth;
    Driver driver;
    Engine engine;

    public Car(String model, VehicleClass vehicleClass, int weigth, Driver driver, Engine engine) {
        this.model = model;
        this.vehicleClass = vehicleClass;
        this.weigth = weigth;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Модель: " + model + ", " + "класс: " + vehicleClass + "\n" +
                "Характеристики:" + "\n" +
                "  вес: " + weigth + " кг" +"\n" +
                "  двигатель: " + engine + "\n" +
                "Водитель: " + driver;

    }
}

