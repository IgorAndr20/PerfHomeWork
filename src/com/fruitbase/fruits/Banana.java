package com.fruitbase.fruits;

import java.math.BigDecimal;

public class Banana extends Fruit {


    public Banana() {
        super.setName("Banana");
        super.setWeight(0.2);
        super.setPrice(BigDecimal.valueOf(20));
    }
}
