import java.util.Scanner;

// Base class
class Vehicle {
    String make, model, fuelType;
    int year;

    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public double fuelEfficiency() {
        return 0;
    }

    public double distanceTraveled(double fuelUsed) {
        return fuelEfficiency() * fuelUsed;
    }

    public int maximumSpeed() {
        return 0;
    }

    public void display() {
        System.out.println("Make       : " + make);
        System.out.println("Model      : " + model);
        System.out.println("Year       : " + year);
        System.out.println("Fuel Type  : " + fuelType);
    }
}

// Truck class
class Truck extends Vehicle {

    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    public double fuelEfficiency() {
        return 8.0; // km/l
    }

    public int maximumSpeed() {
        return 100;
    }
}

// Car class
class Car extends Vehicle {

    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    public double fuelEfficiency() {
        return 18.0; // km/l
    }

    public int maximumSpeed() {
        return 180;
    }
}

// Motorcycle class
class Motorcycle extends Vehicle {

    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    public double fuelEfficiency() {
        return 45.0; // km/l
    }

    public int maximumSpeed() {
        return 140;
    }
}

// Main class
public class Program4{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Vehicle:");
        System.out.println("1. Truck");
        System.out.println("2. Car");
        System.out.println("3. Motorcycle");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Make: ");
        String make = sc.nextLine();

        System.out.print("Enter Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Fuel Type: ");
        String fuelType = sc.nextLine();

        System.out.print("Enter Fuel Used (litres): ");
        double fuelUsed = sc.nextDouble();

        Vehicle vehicle = null;

        switch (choice) {
            case 1:
                vehicle = new Truck(make, model, year, fuelType);
                break;
            case 2:
                vehicle = new Car(make, model, year, fuelType);
                break;
            case 3:
                vehicle = new Motorcycle(make, model, year, fuelType);
                break;
            default:
                System.out.println("Invalid Choice");
                System.exit(0);
        }

        System.out.println("\nVehicle Details");
        vehicle.display();
        System.out.println("Fuel Efficiency : " + vehicle.fuelEfficiency() + " km/l");
        System.out.println("Distance Travelled : " + vehicle.distanceTraveled(fuelUsed) + " km");
        System.out.println("Maximum Speed : " + vehicle.maximumSpeed() + " km/h");

        sc.close();
    }
}