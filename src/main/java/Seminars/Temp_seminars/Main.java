package Seminars.Temp_seminars;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bob", "York", 9, "01.11.2012", 3, true);
        Dog dog2 = new Dog("Mary", "Mops", 3, "01.11.2020", 2, false);
        Dog dog3 = new Dog("Guf", "Doberman", 4, "01.11.2019", 15, true);

        DogCleaner dogStatus = new DogCleaner();

        dogStatus.checkdog(dog2);

    }
}
