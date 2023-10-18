package OOP_Seminars.OOP_seminar_4.view;

import OOP_Seminars.OOP_seminar_4.User;

import java.util.List;

public interface IUserView<T extends User> {
    void sendOnConsole(List<T> list);
}
