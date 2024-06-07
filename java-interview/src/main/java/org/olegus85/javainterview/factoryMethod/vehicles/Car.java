package org.olegus85.javainterview.factoryMethod.vehicles;

public class Car implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Inserting the engine key and pushing the gas pedal");
    }

    @Override
    public void move() {
        startEngine();
        System.out.println("Riding with the wind");
    }
}
