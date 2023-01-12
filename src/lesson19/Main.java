package lesson19;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Дуся", HealthState.HEALTHY, "Россия", 5);
        System.out.println(cat);
        Dog dog = new Dog("Жулик", HealthState.UNHEALTHY, "Германия", 7);
        System.out.println(dog);
        Dog dog2 = new Dog("Крузенштерн", HealthState.HEALTHY, "Китай", 1);
        System.out.println(dog2);
        Horse horse = new Horse("Снежок", HealthState.HEALTHY, "Швеция", 0);

        cat.makeSound();
        dog.makeSound();
        horse.makeSound();
        cat.eat();
        horse.eat();
        dog2.eat();
        dog.sleep();

        Vet vet = new Vet("Василий");
        vet.treatAnimal(cat);
        vet.treatAnimal(dog);
        vet.treatAnimal(dog2);
        vet.treatAnimal(horse);



    }
}
