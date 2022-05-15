package inheritance;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setDoors(4);
        vehicle.setWheels(4);
        vehicle.setColor("Red");
        System.out.println(vehicle);

        Vehicle carVehicle = new Car();
        carVehicle.setDoors(2);
        carVehicle.setWheels(6);
        carVehicle.name = "Power car";
        carVehicle.setColor("White");
        System.out.println(carVehicle);

        Car car = new Car();
        car.setDoors(3);
        car.setWheels(8);
        car.setColor("Blue");
        car.setModel("M-001");
        car.setType("CAR");
        car.setName("Power Beast");
        System.out.println(car);

        Toyota toyota = new Toyota();
        toyota.setDoors(4);
        toyota.setWheels(4);
        toyota.setColor("Black");
        toyota.setModel("TY-005");
        toyota.setType("Luxury");
        toyota.setName("Express");
        toyota.setSeats("4");
        toyota.setSpeed("125km/h");
        System.out.println(toyota);
    }
}
