# Vehicle-Rental---Java
To design and implement a Vehicle Rental System using the Factory Design Pattern in Java.  The system allows users to rent different types of vehicles such as Car, Bike, and Truck.  This project demonstrates Object-Oriented Programming concepts such as abstraction, interface, polymorphism, and design patterns (Factory Pattern). 
🚗 Vehicle Rental System – Factory Design Pattern (Java)
📌 Overview

This project demonstrates the Factory Design Pattern using a simple Vehicle Rental System built in Java.
It shows how object creation is centralized in a factory class instead of being directly instantiated in the client code.

🧠 Design Pattern Used
🏭 Factory Pattern
Encapsulates object creation logic
Provides a common interface for creating different types of vehicles
Makes the system scalable and maintainable
🚀 Features
Rent different types of vehicles (Car, Bike, Truck)
Centralized object creation using Factory
Easy to extend with new vehicle types
Clean OOP structure
🧾 Project Structure
VehicleRentalSystem.java
💻 Code Implementation
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
![1](https://github.com/user-attachments/assets/15d4dd4c-ae81-4a80-bd88-8d18d29c29a4)

▶️ How to Run
1. Compile
javac VehicleRentalSystem.java
2. Run
java VehicleRentalSystem
🧩 Sample Output
Shalini rented a CAR 🚗
Arjun rented a BIKE 🏍️
Kiran rented a TRUCK 🚚
📈 Why Factory Pattern?

✔ Removes tight coupling between object creation and usage
✔ Makes code scalable (easy to add new vehicles like Bus, Van, etc.)
✔ Improves code readability and maintainability

🔥 Future Enhancements
Add pricing system per vehicle
Add availability tracking
Add booking history
Convert into Swing GUI application
👩‍💻 Author

Made with ❤️ using Java OOP concepts & Design Patterns
