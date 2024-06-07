package org.olegus85.javainterview.factoryMethod;

import org.olegus85.javainterview.factoryMethod.factories.CarsFactory;
import org.olegus85.javainterview.factoryMethod.factories.FeetFactory;
import org.olegus85.javainterview.factoryMethod.factories.PlanesFactory;
import org.olegus85.javainterview.factoryMethod.factories.VehicleFactory;

import java.util.Scanner;

public class MainFactory {

    private static VehicleFactory vehicleFactory;

    public static void main(String[] args) {
        howWouldYouLikeToMove();
        moving();
    }

    static void howWouldYouLikeToMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How would you like to move: byAir or byRoad");

        String s = scanner.nextLine();
        if (s.equalsIgnoreCase("byAir")) {
            vehicleFactory = new PlanesFactory();
        } else if (s.equalsIgnoreCase("byRoad")) {
            vehicleFactory = new CarsFactory();
        } else {
            System.out.println("No matching you request transport, walk by yourself");
            vehicleFactory = new FeetFactory();
        }
    }

    static void moving() {
        vehicleFactory.startMoving();
    }
}
