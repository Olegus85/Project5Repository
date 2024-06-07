package org.olegus85.javainterview.factoryMethod.factories;

import org.olegus85.javainterview.factoryMethod.vehicles.Car;
import org.olegus85.javainterview.factoryMethod.vehicles.Vehicle;

public class CarsFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
