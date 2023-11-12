package RaffleToys;

public class StartRaffle {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        Toy toy1 = new Toy(1, "Конструктор -Юность 5-", 20, 20);
        Toy toy2 = new Toy(1, "Конструктор -Lego-", 15, 5);
        Toy toy3 = new Toy(2, "Трансфомер", 200, 40);
        Toy toy4 = new Toy(2, "Мяч", 200, 90);
        Toy toy5 = new Toy(3, "Кукла Barbie", 50, 30);
        Toy toy6 = new Toy(3, "Набор доктора", 200, 70);
        Toy toy7 = new Toy(3, "PlayStation 5", 10, 10);
        Toy toy8 = new Toy(3, "Воздушный змей", 10, 10);

        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);
        store.addToy(toy5);
        store.addToy(toy6);
        store.addToy(toy7);
        store.addToy(toy8);


        store.changeToyFrequency(1, 30);

        store.organizeRaffle();

        Toy prizeToy = store.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Вы выиграли игрушку: " + prizeToy.getName());
        }
    }
}

