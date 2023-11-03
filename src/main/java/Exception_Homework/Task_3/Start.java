package Exception_Homework.Task_3;


import Exception_Homework.Task_3.Controller.AddUserToFile;
import Exception_Homework.Task_3.Controller.StartOperationsUser;
import Exception_Homework.Task_3.Exceptions.NumDataException;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;


public class Start {


    public static void main(String[] args) throws NumDataException, InputMismatchException {


        StartOperationsUser user = new StartOperationsUser();
        Scanner input = new Scanner(System.in);
        String userInput;
        int isExit = 1;
        System.out.println("* Программа запущена *\n");
        while (isExit == 1) {
            System.out.println("\nУкажите 0 для выхода" +
                    "\nУкажите 1 для запуска модуля ввода данных" +
                    "\nУкажите 2 для просмотра списка созданных файлов >");
            userInput = input.next();
            if (Objects.equals(userInput, "1")) {
                System.out.println("Введите данные пользователя, указав фамилию, имя, отчество, дату рождения (формата dd.mm.yyyy), телефон (до 9 знаков) и пол (m или f): ");
                user.addUser();
            }
            if (Objects.equals(userInput, "2")) {
                AddUserToFile ff = new AddUserToFile();

            }
            if (Objects.equals(userInput, "0")) {
                isExit = 0;
                System.out.println("By!");
            }
        }
    }
}
