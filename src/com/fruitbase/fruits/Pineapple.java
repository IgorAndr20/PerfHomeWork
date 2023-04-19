package com.fruitbase.fruits;

import java.math.BigDecimal;

public class Pineapple extends Fruit {

    public Pineapple() {
        super.setName("Pineapple");
        super.setWeight(1.2);
        super.setPrice(BigDecimal.valueOf(80));
    }
}
