package OOP_Seminars.OOP_seminar_4.controller;

import OOP_Seminars.OOP_seminar_4.User;

public interface iUserController<T extends User>  {
    public void ceate(String firstName,
                   String secondName,
                   String patronymic,
                   String dateOfBirth);

}
