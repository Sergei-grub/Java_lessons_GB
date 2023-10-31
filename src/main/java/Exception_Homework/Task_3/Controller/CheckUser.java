package Exception_Homework.Task_3.Controller;

import Exception_Homework.Task_3.Exceptions.BirthdayException;
import Exception_Homework.Task_3.Exceptions.GenderDataException;
import Exception_Homework.Task_3.Exceptions.NumDataException;
import Exception_Homework.Task_3.Exceptions.PhoneNumDataException;


public class CheckUser {
    static void checkUser(String userData, String surname) throws NumDataException, Exception, GenderDataException, BirthdayException {
        checkFIOElements(userData);
        checkBirthday(userData);
        checkPhoneNumber(userData);
        checkGender(userData, surname);


    }

    private static void checkFIOElements(String userData) throws NumDataException {

        if ((userData.chars().filter(s -> s == ' ').count()) != 5) {
            throw new NumDataException("Введено некорректное количество данных: ", userData);
        }
    }

    private static void checkBirthday(String userData) throws BirthdayException {
        String[] words = userData.split(" ");
        String isBirthday = "null";
        for (String word : words) {
            if (word.matches("\\d{2}.\\d{2}.\\d{4}")) {
                String[] date = word.split("\\.");
                for (int i = 0; i < 3; i++) {
                    if (Integer.parseInt(date[0]) < 32){
                        if (Integer.parseInt(date[1]) < 13){
                            if (Integer.parseInt(date[2]) < 2100 && Integer.parseInt(date[2]) > 1900){
                                isBirthday = word;
                            }
                        }
                    }
                }
            }
        }
        if (isBirthday.equals("null")) {
            throw new BirthdayException("Введена некорректная дата рождения. Попробуйте еще раз.\n");
        }
    }


    private static void checkPhoneNumber(String userData) throws PhoneNumDataException{
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

    private static void checkGender(String userData, String surname) {
        try {
            if (userData.contains(" m") || userData.contains(" f")) {
                System.out.println("Данные верны > " + userData);
                AddUserToFile.prepareFile(userData, surname);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}




