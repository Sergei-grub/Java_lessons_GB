package OOP_Homework.Task_1;

import java.util.ArrayList;
import java.util.List;

/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм

1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
и реализовать перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре.
3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
4.Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
*/
public class Task_1 {
    public static void main(String[] args) {
        List<HotDrink> listProduct = new ArrayList<>();
        listProduct.add(new HotDrink("Americano", 0.3, 60));
        listProduct.add(new HotDrink("Americano", 0.5, 70));
        listProduct.add(new HotDrink("Americano", 0.5, 50));
        listProduct.add(new HotDrink("Latte", 0.3, 60));
        listProduct.add(new HotDrink("Latte", 0.5, 70));
        listProduct.add(new HotDrink("Latte", 0.5, 50));
        listProduct.add(new HotDrink("Cappuccino", 0.3, 60));
        listProduct.add(new HotDrink("Cappuccino", 0.5, 70));
        listProduct.add(new HotDrink("Cappuccino", 0.5, 50));
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine(listProduct);

        System.out.println(vendingMachine.getProduct("Americano", 0.7, 50));
        System.out.println(vendingMachine.getProductList());
    }
}
