package Exception_Homework.Task_3.Controller;

import Exception_Homework.Task_3.Exceptions.GenderDataException;
import Exception_Homework.Task_3.Exceptions.NumDataException;
import Exception_Homework.Task_3.Exceptions.PhoneNumDataException;

import java.util.Scanner;

public class StartOperationsUser{

    public void addUser() throws PhoneNumDataException {

        Scanner scanner = new Scanner(System.in);

        String surname = scanner.next();
        String data = scanner.nextLine();
        String result = surname + data;


        try {
            CheckUser.checkUser(result);

        } catch (NumDataException e) {
            System.out.println(e.getMessage() + e.getData());
        } catch (PhoneNumDataException e) {
            System.out.println(e.getMessage() + e.getPhoneNum());;
        } catch (Exception | GenderDataException e) {
            throw new RuntimeException(e);
        }
    }
}

