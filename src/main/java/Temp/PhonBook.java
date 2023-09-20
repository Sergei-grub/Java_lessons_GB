package Temp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


//Задание
//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре будут повторяющиеся имена
// с разными телефонами, их необходимо считать, как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.
public class PhonBook {

    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            StringBuilder phones = new StringBuilder();
            for(int el: item.getValue()){
                phones.append(el).append(", ");
            }
            System.out.printf("%s: %s \n", item.getKey(), phones.toString());
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> phonebook = new HashMap<>();
        addNumber("Пономарев", 49505308, phonebook);
        addNumber("Алексеева", 49560984, phonebook);
        addNumber("Чернов", 49562934, phonebook);
        addNumber("Наумова", 49596830, phonebook);
        addNumber("Алексеева", 49507943, phonebook);
        addNumber("Виноградов", 49544775, phonebook);
        addNumber("Казаков", 49502600, phonebook);
        addNumber("Акимов", 49566350, phonebook);
        addNumber("Бочаров", 49549423, phonebook);
        addNumber("Казаков", 49523217, phonebook);
        printBook(phonebook);
    }
}