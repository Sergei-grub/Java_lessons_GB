package lastHomework;

import Seminars.DogCleaner;

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
public class StartPRGM {
    public static void main(String[] args) {
        Notebook note1 = new Notebook("Acer", 2, 100, "без ОС", "черный");
        Notebook note2 = new Notebook("Apple", 4, 128, "macOS", "белый");
        Notebook note3 = new Notebook("ASUS", 6, 160, "Windows 10", "синий");

        noteFiltr nStatus = new noteFiltr();

        nStatus.checkNote(note1);

        System.out.println(note1);
        System.out.println(note2);
        System.out.println(note3);
    }
}
