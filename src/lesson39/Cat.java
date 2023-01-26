package lesson39;

import static lesson39.Animal.*;

public class Cat extends Animal {
    int age;
    String eyecolour;
    int weight;
    String furcolour;

    public Cat() {
    }

    public Cat(int age) {
        this.age = age;
    }

    public Cat(int age, String eyecolour) {
        this.age = age;
        this.eyecolour = eyecolour;
    }

    public Cat(int age, String eyecolour, int weight) {
        this.age = age;
        this.eyecolour = eyecolour;
        this.weight = weight;
    }

    public Cat(int age, String eyecolour, int weight, String furcolour) {
        this.age = age;
        this.eyecolour = eyecolour;
        this.weight = weight;
        this.furcolour = furcolour;
    }

    @Override
    public String toString() {
        return "Кот" + "\n" +
                "Возвраст, лет = " + age + "\n" +
                "Цвет глаз = " + eyecolour + "\n" +
                "Вес, кг = " + weight + "\n" +
                "Цвет шерсти = " + furcolour + "\n";
    }

    public static void main(String[] args) {
        System.out.println(new Cat());
        System.out.println(new Cat(4));
        System.out.println(new Cat(5, "зеленый"));
        System.out.println(new Cat(6, "голубой", 8));
        System.out.println(new Cat(3, "желтый", 4, "черный"));
        Animal.testStaticMethod();
        Cat.testStaticMethod();
        testStaticMethod();
        System.out.println(planet);
        planet = "Луна";
        System.out.println(new Cat() + planet);
    }
}
