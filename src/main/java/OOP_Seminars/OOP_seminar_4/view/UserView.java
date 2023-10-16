package OOP_Seminars.OOP_seminar_4.view;

import OOP_Seminars.OOP_seminar_4.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
