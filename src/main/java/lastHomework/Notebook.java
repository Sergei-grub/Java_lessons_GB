package lastHomework;

public class Notebook {
    private String name;
    private Integer ram;
    private Integer hdd;
    private String os;
    private String color;

    public Notebook(String name, Integer ram, Integer hdd, String os, String color) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getHdd() {
        return hdd;
    }

    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nNotebook " +"'" + name + "'" +
                "\nRAM = " + ram +
                "\nHDD = " + hdd +
                "\nOS = " + os +
                "\nColor = " + color;
    }
}
