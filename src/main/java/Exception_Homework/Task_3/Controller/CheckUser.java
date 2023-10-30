package Exception_Homework.Task_3.Controller;


import Exception_Homework.Task_3.Exceptions.GenderDataException;
import Exception_Homework.Task_3.Exceptions.NumDataException;
import Exception_Homework.Task_3.Exceptions.PhoneNumDataException;

import java.io.IOException;


public class CheckUser {
    static void checkUser(String userData) throws NumDataException, Exception, GenderDataException {
        checkElements(userData);
        checkPhoneNumber(userData);
        checkGender(userData);


    }

    private static void checkElements(String userData) throws NumDataException {

        if ((userData.chars().filter(s -> s == ' ').count()) != 4) {
            throw new NumDataException("Введено некорректное количество данных: ", userData);
        }
    }

    private static void checkPhoneNumber(String userData) throws PhoneNumDataException, GenderDataException {
        String[] words = userData.split(" ");
        String number = "null";
        for (String word : words) {
            if (word.matches("\\d+")) {
                number = word;
            }
        }

        if (number.equals("null")) {
            throw new PhoneNumDataException("Введен некорректный номер телефона. Попробуйте еще раз.\n");
        }

        try {
            if (number.matches("\\d+")) {
                if (number.length() < 4 | number.length() > 9) {
                    throw new PhoneNumDataException("Введен некорректный номер телефона: ", number);
                }
            }

        } catch (PhoneNumDataException e) {
            System.out.println(e.getMessage() + e.getPhoneNum());
        } catch (NullPointerException e) {
            throw new PhoneNumDataException("Введен некорректный номер телефона: ", e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void checkGender(String userData) {
        boolean isTrue = true;
        try {
            if (userData.contains(" m") || userData.contains(" f")) {
                System.out.println("Данные верны > " + userData);
                AddUserToFile.prepareFile(userData);
            }
//            else {
//                throw new GenderDataException("Пол указан некорректно: ", userData);
//            }
//        } catch (GenderDataException e) {
//            System.out.println(e.getMessage() + e.genderData);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}




