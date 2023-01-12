package ru.pflb;

public abstract class Person {
    protected int age;
    protected String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ФИО: " + name + "\n" +
               "Возраст: " + age + "лет/года";
    }
}
