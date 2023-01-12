package lesson19;

public class Cat extends Animal {

    private static int counter;

    public Cat(String name, HealthState health, String location, int foodCounter) {
        this.name = name;
        this.health = health;
        this.food = "Вискас";
        this.location = location;
        this.foodCounter = foodCounter;
        counter += 1;
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу");
    }
    @Override
    public String toString() {
        return super.toString() + "\n" + "Количество животных " + counter;
    }
}
