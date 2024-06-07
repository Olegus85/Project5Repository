package org.olegus85.javainterview.factoryMethod.vehicles;

public class Plane implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Switching tons of buttons to start the plane");

    }

    @Override
    public void move() {
        startEngine();
        System.out.println("Flying above the clouds");
    }
}
