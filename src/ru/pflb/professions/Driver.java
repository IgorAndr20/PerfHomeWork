package ru.pflb.professions;

import ru.pflb.Person;

public class Driver extends Person {
    int drivingExpirience;
    int licenceid;

    public Driver(int age, String name, int drivingExpirience, int licenceid) {
        super(age, name);
        this.drivingExpirience = drivingExpirience;
        this.licenceid = licenceid;
    }

    @Override
    public String toString() {
        return name + " - " + age +  " лет/года" + "\n"+
                "   -стаж: " + drivingExpirience + " лет/года" + "\n" +
                "   -№ удостоверения: " + licenceid;
    }
}
