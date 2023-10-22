package OOP_Homework.Task_7_Attestation;

import API_Lessons.Lesson_2.Ex005_Logger;
import OOP_Homework.Task_7_Attestation.Controller.SelectOperation;
import OOP_Homework.Task_7_Attestation.Model.CalcLogger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ProgramStart {
    public static void main(String[] args) {
        CalcLogger log = new CalcLogger();
        log.logger();


        System.out.println("\n*_*_* Калькулятора комплексных чисел *_*_*\n");
        SelectOperation start = new SelectOperation();
        start.calc();


//        System.out.println(log);





    }

}
