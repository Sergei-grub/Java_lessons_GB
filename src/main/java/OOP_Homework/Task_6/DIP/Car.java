package OOP_Homework.Task_6.DIP;

// Принципы SOLID
// D — Dependency Inversion (Принцип инверсии зависимостей)
// Из класса "Car" убрали зависимости от других классов через создание интерфейса "Engine".
public class Car {
    public Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }

    public void gas(){
        engine.gas();
    }
}
