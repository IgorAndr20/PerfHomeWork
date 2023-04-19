package com.fruitbase.fruits;

import java.math.BigDecimal;

public abstract class Fruit {
    private String name;
    private double weight;
    private BigDecimal price;

    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public BigDecimal getPrice() {
        return price;
    }
}
