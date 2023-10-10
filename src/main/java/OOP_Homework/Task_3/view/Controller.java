package OOP_Homework.Task_3.view;

import OOP_Homework.Task_3.model.Stream;
import OOP_Homework.Task_3.model.StreamComparator;
import OOP_Homework.Task_3.model.StreamIterator;
import OOP_Homework.Task_3.model.Group;


import java.util.*;

public class Controller {


    public static void SmpCalc() {
        System.out.println("\nНажмите 1 для вывода потоков: ");
//        ArrayList
        Scanner scan = new Scanner(System.in);
        char operation = scan.next().charAt(0);

        switch (operation) {
            case '1':
                PrintFlow();
                System.out.printf("Вывод групп потока (сортировка по кол-ву учащихся) \n");
                break;
            case '2':
                System.out.printf("Остальные функции в разработке.\n");
                break;
            default:
                break;
        }
    }


    static void PrintFlow() {
        Group grr1 = new Group("1", "AA", 31);
        Group grr2 = new Group("2", "BB", 27);
        Group grr3 = new Group("3", "CC", 30);
        Group grr4 = new Group("4", "DD", 25);
        Group grr5 = new Group("5", "EE", 19);

        Stream add1 = new Stream();
        add1.add(grr1);
        add1.add(grr5);
        add1.add(grr3);
        add1.add(grr4);
        add1.add(grr2);

        List<Group> groupList = new ArrayList<>(List.of(new Group[]{grr1, grr3, grr2, grr4, grr5}));
        StreamIterator fgi = new StreamIterator(groupList);

        while (fgi.hasNext()) {
            System.out.println(fgi.next());
        }
        System.out.println();
        Comparator sort1 = new StreamComparator();
        Collections.sort(groupList, sort1);
        System.out.println(groupList);


    }
}