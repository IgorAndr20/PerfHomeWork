package com.fruitbase;

import com.fruitbase.fruits.Fruit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cargo {

    private ArrayList<Fruit> cargo;

    public Cargo() {
        cargo = new ArrayList<>();
    }


    public double getWeight() {
        double weight = 0;
        for (Fruit fruit : cargo) {
            weight += fruit.getWeight();
            ;
        }
        return weight;
    }

    public BigDecimal getPrice() {
        BigDecimal price = BigDecimal.ZERO;
        for (Fruit fruit : cargo) {
            price = price.add(fruit.getPrice());
        }
        return price;
    }

    void addFruit(Fruit fruit) {
        cargo.add(fruit);
    }
}
