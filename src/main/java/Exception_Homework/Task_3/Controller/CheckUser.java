package Exception_Homework.Task_3.Controller;

import Exception_Homework.Task_3.Exceptions.NumDataException;
import Exception_Homework.Task_3.Exceptions.PhoneNumDataException;


public class CheckUser {
    static void checkUser(String userData) throws NumDataException, PhoneNumDataException {


        if ((userData.chars().filter(s -> s == ' ').count()) != 4) {
            throw new NumDataException("Введено некорректное количество данных: ", userData);
        } else {
            String[] words = userData.split(" ");
            for (String word : words) {
                if (word.chars().allMatch(Character::isDigit)) {
                    if (word.length() < 4) {
                        throw new PhoneNumDataException("Введен некорректный номер телефона: ", word);
                    }
                }
                System.out.println("Есть номер, это:" + word);
            }
        }
    }
}


//        if (userData.contains("m") | userData.contains("f")) {
//            System.out.println("Есть пол:");
//        }


//
//        String num = "3345";
//        System.out.println("***");
//        System.out.println(num.chars().allMatch(Character::isDigit));
//
//        String str = "Ilener Little Raningem 12543 f";
//        String[] words = str.split(" ");
//        for (String word : words) {
//            if (word.chars().allMatch(Character::isDigit)){
//                if (word.length() > 4) System.out.println("Есть номер, это:" + word);
//            }
//            System.out.println(word);
//        }
