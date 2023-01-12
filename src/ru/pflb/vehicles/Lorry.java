package ru.pflb.vehicles;

import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;

public class Lorry extends Car{
    int loadingAmount;

    public Lorry(String model, VehicleClass vehicleClass, int weigth, Driver driver, Engine engine, int loadingAmount) {
        super(model, vehicleClass, weigth, driver, engine);
        this.loadingAmount = loadingAmount;
        this.vehicleClass = VehicleClass.LARGE;
    }

    @Override
    public String toString() {
        return "Модель: " + model + ", " + "класс: " + vehicleClass + "\n" +
                "Характеристики:" + "\n" +
                "  вес: " + weigth + " кг" + "\n" +
                "  двигатель: " + engine + "\n" +
                "  грузоподъемность: " + loadingAmount + " кг" + "\n" +
                "Водитель: " + driver;
    }
}

