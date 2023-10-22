package OOP_Homework.Task_6.DIP;

public class PetrolEngine implements Engine {
    @Override
    public void start(){
        System.out.println("Бензиновый двигатель запущен");
    }

    @Override
    public void gas() {
        System.out.println("    Есть возможность подключить газовый гибрид");
    }
}
