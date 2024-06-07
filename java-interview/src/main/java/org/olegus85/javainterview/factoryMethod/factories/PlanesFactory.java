package org.olegus85.javainterview.factoryMethod.factories;

import org.olegus85.javainterview.factoryMethod.vehicles.Plane;
import org.olegus85.javainterview.factoryMethod.vehicles.Vehicle;

public class PlanesFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Plane();
    }
}
