package OOP_Homework.Task_1;

public class HotDrink extends Product{
    private int temperature;
    public HotDrink(String name, double volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "\nHotDrink: " +
                "name = " + super.getName() +
                ", volume = " + super.getVolume() +
                ", temperature = " + temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}
