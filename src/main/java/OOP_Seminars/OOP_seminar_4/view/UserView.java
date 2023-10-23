package OOP_Seminars.OOP_seminar_4.view;

import OOP_Seminars.OOP_seminar_4.Student;
import OOP_Seminars.OOP_seminar_4.StudentGroup;
import OOP_Seminars.OOP_seminar_4.User;

import java.util.List;
import java.util.logging.Logger;

public class UserView {

    Logger logger = Logger.getLogger(UserView.class.getName());

    public void sendOnConsole(List<User> userList){
        for(User user: userList){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

    public void sendOnConsoleListStudent(List<Student> students){
        logger.info(students.toString());
    }

}
