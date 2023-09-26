package LastJavaHomework;


public class Notebook {
    String brand;
    String model;
    int ram;
    int hardDisk;
    String operSystem;
    String color;

    public Notebook(String brand, String model, int ram, int hardDisk, String operSystem, String color) {
        this.brand = brand.toUpperCase();
        this.model = model.toUpperCase();
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.operSystem = operSystem.toUpperCase();
        this.color = color.toLowerCase();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getOperSystem() {
        return operSystem;
    }

    public void setOperSystem(String operSystem) {
        this.operSystem = operSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showInfo() {
        System.out.println(String.format("Производитель: %s\nМодель: %s\nОЗУ(Гб): %d\nОбъем жесткого диска(Гб): %d\nОС: %s\nЦвет: %s\n", this.brand, this.model, this.ram, this.hardDisk, this.operSystem, this.color));
    }

    @Override
    public String toString() {
        return (String.format("Производитель: %s\nМодель: %s\nОЗУ(Гб): %d\nОбъем жесткого диска(Гб): %d\nОС: %s\nЦвет: %s\n" + "\n", this.brand, this.model, this.ram, this.hardDisk, this.operSystem, this.color));
    }
}