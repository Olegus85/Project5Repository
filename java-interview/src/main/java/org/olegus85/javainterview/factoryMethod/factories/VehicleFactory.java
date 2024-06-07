package org.olegus85.javainterview.factoryMethod.factories;

import org.olegus85.javainterview.factoryMethod.vehicles.Vehicle;

public abstract class VehicleFactory {

    public abstract Vehicle createVehicle();

    public void startMoving() {
        Vehicle vehicle = createVehicle();
        vehicle.move();
    }
}
