package Exception_Homework.Task_3;


import Exception_Homework.Task_3.Data.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Start {
    public static void main(String[] args) {
        List<String> arrayUsers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String fio = scanner.next();
        String birthday = scanner.next();
        String phoneNumber = scanner.next();
        String gender = scanner.next();


        //    private String fio;
        //    private String birthday;
        //    private int phoneNumber;
        //    private char gender;

//        arrayUsers.add(fio);
        String addSTR = fio + " " + birthday + " " + phoneNumber  + " " + gender;
        arrayUsers.add(fio);
        arrayUsers.add(birthday);
        arrayUsers.add(phoneNumber);
        arrayUsers.add(gender);

        System.out.println(arrayUsers);
        System.out.println("* * *");
        System.out.println(addSTR);



        String dataUser5 = scanner.nextLine();
        arrayUsers.add(dataUser5);
        addSTR += dataUser5;
        System.out.println(arrayUsers);
        System.out.println(addSTR);



        User user1 = new User("Ivanov Vasiliy Sergeevich", "22.12.1990", 49588877, 'm');
        User user2 = new User("Sidorov Igor Aleksandrovich", "23.01.1988", 46566877, 'm');

        String text = String.valueOf(user1);


//        List<User> users = List.of(new User("Ivanov Vasiliy Sergeevich", "22.12.1990", 49588877, 'm'));
//        users.add(1, user1);

//        System.out.println(users);
//        System.out.println(user1);
//        System.out.println(text);

    }
}
