package OOP_Seminars.Temp_seminars;

import java.util.ArrayList;
import java.util.List;

public class DogCleaner {
    private List<Dog> DogHouse = new ArrayList<>();

    public void checkdog(Dog dog) {
        if (dog.getState()) {
            DogHouse.add(dog);
        } else System.out.println("Собака " + dog.getName() + " здорова!");
    }
}
