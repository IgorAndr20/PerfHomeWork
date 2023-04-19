package com.fruitbase.fruits;

import java.math.BigDecimal;

public class Apple extends Fruit {


    public Apple() {
        super.setName("Apple");
        super.setWeight(0.25);
        super.setPrice(BigDecimal.valueOf(25));
    }
}
