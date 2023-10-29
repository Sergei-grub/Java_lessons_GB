package Exception_Homework.Task_3.Controller;

import Exception_Homework.Task_3.Exceptions.NumDataException;
import Exception_Homework.Task_3.Exceptions.PhoneNumDataException;

import java.util.Scanner;

public class AddUser {

    public void addUser() {

        Scanner scanner = new Scanner(System.in);

        String surname = scanner.next();
        String data = scanner.nextLine();
        String result = surname + data;


        try {
            CheckUser.checkUser(result);
        } catch (NumDataException e) {
            System.out.println(e.getMessage() + e.getData());
        } catch (PhoneNumDataException e) {
            System.out.println(e.getMessage() + e.getPhoneNum());
        }

    }

}

//            return result;
//        long count = data.chars().filter(s -> s == ' ').count();
//        System.out.println(count);
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
