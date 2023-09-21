package Homework;

import java.util.Arrays;
import java.util.HashMap;

// 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2. Создать множество ноутбуков.
// 3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
// отвечающие фильтру. Критерии фильтрации можно хранить в Map.
// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
//    1. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//    2. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. https://javarush.com/groups/posts/1939-comparator-v-java
public class Interim_certification_Java {
    public static void main(String[] args) {
//        HashMap<Integer, Object> note = new HashMap<>();

        String[][] notebooks = {{"Acer", "1", "2ГБ", "100ГБ", "без ОС", "черный" },
                                {"Apple", "2", "4ГБ", "128ГБ", "macOS", "белый"},
                                {"ASUS", "3", "6ГБ", "160ГБ", "Windows 10", "синий"},

        };
        


        Arrays.stream(notebooks).map(Arrays::toString).forEach(System.out::println);

        System.out.println(Arrays.deepToString(notebooks));


    }
}

