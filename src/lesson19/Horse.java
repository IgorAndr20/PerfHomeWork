package lesson19;

public class Horse extends Animal{
    private static int counter;

    public Horse(String name, HealthState health, String location, int foodCounter) {
        this.name = name;
        this.health = health;
        this.food = "Сено";
        this.location = location;
        this.foodCounter = foodCounter;
        counter += 1;
    }
    @Override
    public void makeSound() {
        System.out.println("Игого");
    }
    @Override
    public String toString() {
        return super.toString() + "\n" + "Количество животных " + counter;
    }
}
