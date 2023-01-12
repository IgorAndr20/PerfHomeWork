package lesson19;

public class Dog extends Animal{
    private static int counter;

    public Dog(String name, HealthState health, String location, int foodCounter) {
        this.name = name;
        this.health = health;
        this.food = "Кость";
        this.location = location;
        this.foodCounter = foodCounter;
        counter += 1;
    }
    @Override
    public void makeSound() {
        System.out.println("Гав");
    }
    @Override
    public String toString() {
        return super.toString() + "\n" + "Количество животных " + counter;
    }
}

