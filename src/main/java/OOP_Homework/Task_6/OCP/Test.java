package OOP_Homework.Task_6.OCP;


public class Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(100, "SOLID");
        System.out.println(vehicle.getType() + " " + vehicle.calculateAllowedSpeed());
        Car car = new Car(200);
        System.out.println(car.getType() + " " + car.calculateAllowedSpeed());
        Bus bus = new Bus(100);
        System.out.println(bus.getType() + " " + bus.calculateAllowedSpeed());

    }
}
