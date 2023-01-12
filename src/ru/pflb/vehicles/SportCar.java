package ru.pflb.vehicles;

import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;

public class SportCar extends Car{
    int maxVelocity;

    public SportCar(String model, VehicleClass vehicleClass, int weigth, Driver driver, Engine engine, int maxVelocity) {
        super(model, vehicleClass, weigth, driver, engine);
        this.maxVelocity = maxVelocity;
    }

    @Override
    public String toString() {
        return "Модель: " + model + ", " + "класс: " + vehicleClass + "\n" +
                "Характеристики:" + "\n" +
                "  вес: " + weigth + " кг" + "\n" +
                "  двигатель: " + engine + "\n" +
                "  максимальная скорость: " + maxVelocity +  " км/ч" + "\n" +
                "Водитель: " + driver;
    }
}
