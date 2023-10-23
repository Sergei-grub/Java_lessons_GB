package OOP_Homework.Task_6.DIP;

public class Test {
    public static void main(String[] args) {
        Car car = new Car(new PetrolEngine());
        car.start();
        car.gas();
        System.out.println();
        car = new Car(new DieselPetrol());
        car.start();
        car.gas();
    }
}
