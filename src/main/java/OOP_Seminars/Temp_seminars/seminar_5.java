package OOP_Seminars.Temp_seminars;

import java.util.*;

public class seminar_5 {
//    public static void main(String[] args) {

//        Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
//        123456 Иванов
//        321456 Васильев
//        234561 Петрова
//        234432 Иванов
//        654321 Петрова
//        345678 Иванов
//        Вывести данные по сотрудникам с фамилией Иванов.

/*        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(123456, "Иванов");
        hashMap.put(321456, "Васильев");
        hashMap.put(234561, "Петрова");
        hashMap.put(234432, "Иванов");
        hashMap.put(654321, "Петрова");
        hashMap.put(345678, "Иванов");
        System.out.println(hashMap.entrySet());
        for (var item : hashMap.entrySet()) {
            if (item.getValue().equals("Иванов")) {
                System.out.println(item);
            }
        }*/


    /*
    Подсчет частоты слов:
    Напишите программу, которая считывает текст из файла и подсчитывает,
    сколько раз каждое слово встречается в тексте.
    Используйте HashMap для хранения пар "слово - частота".

    Lorem ipsum dolor sit amet, consectetur adipiscing elit.
    Sed eget libero auctor, varius felis in, faucibus tortor.
    Integer eget leo vitae justo auctor facilisis. Pellentesque
    ac urna in libero cursus bibendum. Maecenas auctor est nec arcu tincidunt,
    eget hendrerit metus bibendum. Ut vestibulum ligula a nulla pellentesque,
    sit amet tristique neque aliquet. Curabitur euismod aliquet lorem,
    in lacinia nunc viverra a. Sed vitae tincidunt ipsum. Nullam eget aliquam libero.
    Donec fringilla a lorem vel feugiat. Sed eu nisl nec justo laoreet euismod.
    Morbi non massa id turpis posuere placerat.


    */
/*    public static void main(String[] args) {
        String line = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eget libero auctor, varius felis in, faucibus tortor. Integer eget leo vitae justo auctor facilisis. Pellentesque ac urna in libero cursus bibendum. Maecenas auctor est nec arcu tincidunt, eget hendrerit metus bibendum. Ut vestibulum ligula a nulla pellentesque, sit amet tristique neque aliquet. Curabitur euismod aliquet lorem, in lacinia nunc viverra a. Sed vitae tincidunt ipsum. Nullam eget aliquam libero. Donec fringilla a lorem vel feugiat. Sed eu nisl nec justo laoreet euismod. Morbi non massa id turpis posuere placerat.";

        line = line.toLowerCase();
        line = line.replace("\"","").replace(",","").replace(".","");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(line.split(" ")));
//        System.out.println(arrayList);
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (map.containsKey(arrayList.get(i))){
                int temp = map.get(arrayList.get(i)) + 1;
                map.put(arrayList.get(i),temp);
            }else {
                map.put(arrayList.get(i),1);
            }
        }
        System.out.println(map.toString());
        System.out.println("Thanks");
    }*/


    /*
    Взять набор строк, например "Мороз и солнце день чудесный. Еще ты дремлешь друг прелестный Пора красавица проснись."
    Написать метод, который отсортирует эти строки по длине с помощью TreeMap.
    Строки с одинаковой длиной не должны “потеряться”.
    */
    public static void main(String[] args) {
        /*
            Взять набор строк, например,Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.
            Написать метод, который отсортирует эти строки по длине с помощью TreeMap.
            Строки с одинаковой длиной не должны “потеряться”.
         */
        String line = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.";
        counterByLength(line);
    }
    public static void counterByLength(String line){
        TreeMap<Integer, ArrayList<String>> treeMap = new TreeMap<>();
        line = line.replace("\"","").replace(".","").toLowerCase();
        String[] array = line.split(" ");

        for (int i = 0; i < array.length; i++) {
            int length = array[i].length();
            if (treeMap.containsKey(length)){
                var temp = treeMap.get(length);
                temp.add(array[i]);
                treeMap.put(length,temp);
            }else {
                treeMap.put(length,new ArrayList<>(Collections.singletonList(array[i])));
            }

        }

        System.out.println(treeMap);
    }
}





