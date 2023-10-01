package OOP_Homework.Task_1;

public abstract class Product {
    private String name;
    private double volume;

    public Product(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

}
