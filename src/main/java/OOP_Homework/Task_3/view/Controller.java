package OOP_Homework.Task_3.view;

import OOP_Homework.Task_3.model.Flow;
import OOP_Homework.Task_3.model.Group;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {


    public static void SmpCalc() {
        System.out.println("\nНажмите 1 для вывода потоков: ");
        Scanner scan = new Scanner(System.in);
        char operation = scan.next().charAt(0);

        switch (operation) {
            case '1':
                PrintFlow();
                System.out.printf("Вывод групп\n");
                break;
            case '2':

                System.out.printf("Результат: %d\n");
                break;
            default:
                break;
        }
    }


//    static void PrintFlow() {
//        Flow f1 = new Flow();
//        f1.getGroupsList().add(Group grr1);
////        List<Group> groupList = new ArrayList<>(List.of(new Group[]{gr1, gr3, gr4, gr2, gr5}));
//        for (Group i : groupList) {
//            System.out.println(i);
//        }
//    }

        static void PrintFlow() {
            Group grr1 = new Group(1, "AA", 31);
            Group grr2 = new Group(2, "BB", 27);
            Group grr3 = new Group(3, "CC", 30);
            Group grr4 = new Group(4, "DD", 25);
            Group grr5 = new Group(5, "EE", 19);
//          List<Group> groupList = new ArrayList<>(List.of(new Group[]{grr1, grr3, grr4, grr2, grr5}));
//          for (Group i : groupList) {
//                System.out.println(i);
//            }

            Flow f1 = new Flow();
            f1.getGroupsList().add(grr1);
            System.out.println();

            for (Flow i : groupList) {
                System.out.println(i);
            }

    }


}
