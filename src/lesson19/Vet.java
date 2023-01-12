package lesson19;

public class Vet {
    private String name;
    public Vet(String name) {
        this.name = name;
    }



    public void treatAnimal(Animal animal) {
        if (animal.health == HealthState.HEALTHY) {
            System.out.println(animal.name + " здоров(а), лечение не требуется");
        } else {
            animal.health = HealthState.HEALTHY;
            System.out.println(animal.name + " вылечен(а)");
        }
    }
}
