package OOP_Homework.Task_4.controller;

import OOP_Homework.Task_4.data.User;

public interface iUserController<T extends User>  {
    public void ceate(String firstName,
                   String secondName,
                   String patronymic,
                   String dateOfBirth);

}
