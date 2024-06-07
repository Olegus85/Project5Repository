package org.olegus85.javainterview.factoryMethod.factories;

import org.olegus85.javainterview.factoryMethod.vehicles.Feet;
import org.olegus85.javainterview.factoryMethod.vehicles.Vehicle;

public class FeetFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Feet();
    }
}
