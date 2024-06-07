package org.olegus85.javainterview.factoryMethod.vehicles;

public class Feet implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Stand up");
    }

    @Override
    public void move() {
        startEngine();
        System.out.println(" and slowly walk...");
    }
}
