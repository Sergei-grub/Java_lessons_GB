package OOP_Homework.Task_7_Attestation.Controller;

import OOP_Homework.Task_7_Attestation.Model.CalcLogger;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SelectOperation {
    public void calc() {
        Logger log = Logger.getLogger(CalcLogger.class.getName());

        Scanner input = new Scanner(System.in);
        int operation = 0;

        while (operation != 3) {
            System.out.println("\n  Выберите действие: \n" +
                    "   1 — Запустить калькулятор Комплексных чисел\n" +
                    "   2 — Посмотреть журнал операций\n" +
                    "   3 — Выход");
            System.out.print("-> ");
            operation = input.nextInt();
            switch (operation) {
                case (1):
                    StartCalculate toStart = new StartCalculate();
                    log.log(Level.INFO, "Запуск ", toStart);
                    toStart.startOperation();

                    break;
                case (2):
                    System.out.println("Журнал операций");
                    break;
                case (3):
                    System.out.println("До новых встреч!");
                    break;
                default:
                    break;
            }
        }
    }
}