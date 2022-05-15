package constructor;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(4,4,"Red");
        System.out.println(vehicle1);

        Vehicle vehicle2 = new Toyota();
        System.out.println();

        vehicle2.setDoors(2);
        vehicle2.setWheels(6);
        vehicle2.setColor("Core Red");
        System.out.println(vehicle2);

        Vehicle carVehicle = new Car(2,4,"White","Power car","M-001");
        carVehicle.name="Power car";
        System.out.println(carVehicle);

        Car car = new Car(4,8,"Blue","Economy","M-005");
        car.setDoors(3);
        car.setWheels(8);
        car.setColor("Blue");
        car.setModel("M-001");
        car.setType("CAR");
        car.setName("Power Beast");
        System.out.println(car);

        Toyota toyota = new Toyota(4,4,"Black","Luxury","TY-005","125km/h","4");
        toyota.setName("Express");
        System.out.println(toyota);
    }
}
