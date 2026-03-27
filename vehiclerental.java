// ===============================
// FACTORY DESIGN PATTERN - VEHICLE RENTAL SYSTEM
// Single File Implementation
// ===============================

interface Vehicle {
    void rent(String customerName);
}

// -------------------------------
// Concrete Products
// -------------------------------
class Car implements Vehicle {
    public void rent(String customerName) {
        System.out.println(customerName + " rented a CAR 🚗");
    }
}

class Bike implements Vehicle {
    public void rent(String customerName) {
        System.out.println(customerName + " rented a BIKE 🏍️");
    }
}

class Truck implements Vehicle {
    public void rent(String customerName) {
        System.out.println(customerName + " rented a TRUCK 🚚");
    }
}

// -------------------------------
// Factory Class
// -------------------------------
class VehicleFactory {

    public static Vehicle getVehicle(String type) {
        if (type == null) return null;

        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            case "truck":
                return new Truck();
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}

// -------------------------------
// Client Code (Main Class)
// -------------------------------
public class VehicleRentalSystem {

    public static void main(String[] args) {

        Vehicle v1 = VehicleFactory.getVehicle("car");
        v1.rent("Shalini");

        Vehicle v2 = VehicleFactory.getVehicle("bike");
        v2.rent("Arjun");

        Vehicle v3 = VehicleFactory.getVehicle("truck");
        v3.rent("Kiran");
    }
}