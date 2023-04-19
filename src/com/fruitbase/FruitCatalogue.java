package com.fruitbase;

import com.fruitbase.fruits.*;

public class FruitCatalogue {
    private Fruit[] fruits;


    public FruitCatalogue() {
        fruits = new Fruit[]{
                new Orange(),
                new Pineapple(),
                new Apple(),
                new Banana(),
        };
    }

    Fruit findFruit(String name) {
        for (Fruit fruit : fruits) {
            if (fruit.getName().equals(name)) {
                return fruit;
            }
        }
        return null;
    }
}
