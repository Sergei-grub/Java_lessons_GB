package OOP_Homework.Task_6.DIP;

public class DieselPetrol implements Engine {

    public void start() {
        System.out.println("Запустили дизельный двигатель");
    }

    @Override
    public void gas() {
        System.out.println("    Нет возможности подключить газовый гибрид");
    }
}
