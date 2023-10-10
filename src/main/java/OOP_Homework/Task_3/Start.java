package OOP_Homework.Task_3;

import OOP_Homework.Task_3.view.Controller;

import java.util.Scanner;


public class Start {

    public static void main(String[] args){
        Controller start = new Controller();
        System.out.println("--- ПРОСТОЙ КАЛЬКУЛЯТОР ---");
        boolean endProg = true;
        while (endProg){
            System.out.println("\n1 - Запустить программу; \n0 — или другое число для выхода.");
            System.out.print("\nВыберите пункт меню: ");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            if (num != 0){
                Controller.SmpCalc();
            }
            else {
                endProg = false;
            }
        }
        System.out.println("До новых встреч! ");
    }

}
