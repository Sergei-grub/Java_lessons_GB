package Exception_Homework.Task_3.Controller;

import Exception_Homework.Task_3.Exceptions.BirthdayException;
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
            CheckUser.checkUser(result,surname);

        } catch (NumDataException e) {
            System.out.println(e.getMessage() + e.getData());
        } catch (BirthdayException e) {
            System.out.println(e.getBirthday());
        } catch (PhoneNumDataException e) {
            System.out.println(e.getMessage() + e.getPhoneNum());
        } catch (GenderDataException e) {
//            throw new RuntimeException(e);
            System.out.println(e.getMessage() + e.getGenderData());
        } catch (Exception e) {
            System.out.println(e.getMessage());
    }

    }
}

