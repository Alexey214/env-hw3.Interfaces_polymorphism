package com.company;

public class Bicycle extends Transport {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на велосипеде");
    }

    @Override
    void checkEngine() {

    }

    @Override
    void checkTrailer() {

    }
}
