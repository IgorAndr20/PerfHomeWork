package lesson19;

public abstract class Animal {

    protected String name;
    protected String food;
    protected int foodCounter;
    protected String location;

    protected HealthState health;

    public abstract void makeSound();

    public void eat() {
        if (foodCounter > 1) {
            System.out.println(name + " ест " + food);
            System.out.println(name + " покушал(а)");
            foodCounter -= 1;
            System.out.println("У " + name + " осталось " + foodCounter + " еды");
        } else if (foodCounter == 1) {
            System.out.println(name + " ест " + food);
            System.out.println(name + " покушал(а)");
            System.out.println("У " + name + " не осталось еды");
            foodCounter -= 1;

        } else {
            System.out.println(name + " останется голодным");
            System.out.println("У " + name + " не осталось еды");
        }
    }

    

    public String toString() {
        return "Кличка " + name + "\n" +
                "Страна: " + location + "\n" +
                "Состояние здоровья: " + health;

    }

    public void sleep() {
        System.out.println(name + " спит");
    }


}

