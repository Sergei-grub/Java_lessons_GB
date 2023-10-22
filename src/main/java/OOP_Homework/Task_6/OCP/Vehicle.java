package OOP_Homework.Task_6.OCP;

// Принципы SOLID
// O — Open-Closed (Принцип открытости-закрытости)
// Расчеты максимальной скорости были перенесены в отдельные классы, чтобы не модифицировать основной класс и
// избежать ошибки там, где задействован основной класс "Vehicle".

public class Vehicle {
    private int maxSpeed;
    private String type;

    public double calculateAllowedSpeed(){
        return maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
}
