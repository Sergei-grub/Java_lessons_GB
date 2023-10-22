package OOP_Homework.Task_7_Attestation.Controller;

import OOP_Homework.Task_7_Attestation.Model.CalculateFunctions;
import OOP_Homework.Task_7_Attestation.Model.Complex;

import java.util.Scanner;

public class StartCalculate {
    public void startOperation() {

        Scanner input = new Scanner(System.in);
        int calculate = 0;
        System.out.println("Введите последовательно два комплексных числа:");
        System.out.print("\nВведите действительные и мнимые части ПЕРВОГО комплексного числа: ");
        TakeComplex num1 = new TakeComplex();
        Complex complex1 = num1.takeComplexNum();
        System.out.print("\nВведите действительные и мнимые части ВТОРОГО комплексного числа: ");
        TakeComplex num2 = new TakeComplex();
        Complex complex2 = num2.takeComplexNum();



        while (calculate != 5) {
            System.out.println("\n  Выберите операцию: \n" +
                    "   Для сложения нажмите 1\n" +
                    "   Для вычитания нажмите 2\n" +
                    "   Для умножения нажмите 3\n" +
                    "   Для деления нажмите 4\n" +
                    "   Для Выхода нажмите 5");
            System.out.print("-> ");
            calculate = input.nextInt();

            switch (calculate) {
                case (1):
                    CalculateFunctions sumResult = new CalculateFunctions();
                    sumResult.sumFunction(complex1, complex2);
                    break;
                case (2):
                    CalculateFunctions diffResult = new CalculateFunctions();
                    diffResult.diffFunction(complex1, complex2);
                    break;
                case (3):
                    CalculateFunctions mulResult = new CalculateFunctions();
                    mulResult.mulFunction(complex1, complex2);
                    break;
                case (4):
                    CalculateFunctions divResult = new CalculateFunctions();
                    divResult.divFunction(complex1, complex2);
                    break;
                case (5):
                    System.out.println("5 Exit");
                    break;
                default:
                    break;
            }
        }
    }
}
