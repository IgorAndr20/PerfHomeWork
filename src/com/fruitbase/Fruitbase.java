package com.fruitbase;

import com.fruitbase.fruits.Fruit;


public class Fruitbase {
    FruitCatalogue catalogue;

    public Fruitbase() {

        catalogue = new FruitCatalogue();
    }

    public Cargo takeOrder(String[] order) {
        Cargo cargo = new Cargo();
        for (String name : order) {
            Fruit fruit = catalogue.findFruit(name);
            if (fruit != null) {
                cargo.addFruit(fruit);
            }
        }
        return cargo;
    }

    public static void main(String[] args) {
        Fruitbase fruitbase = new Fruitbase();
        if (args.length == 0) {
            System.out.println("Заказ пуст");
            return;
        }
        Cargo cargo = fruitbase.takeOrder(args);
        if (cargo.getWeight() == 0) {
            System.out.println("Нет в наличии");
        } else {
            System.out.println("Общий вес заказа: " + cargo.getWeight() + " кг");
            System.out.println("Стоимость заказа: " + cargo.getPrice() + " р.");

        }
    }
}

