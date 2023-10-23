package OOP_Seminars.OOP_seminar_3.TeacherGit.view;

import OOP_Seminars.OOP_seminar_3.TeacherGit.data.Student;
import OOP_Seminars.OOP_seminar_3.TeacherGit.data.StudentGroup;
import OOP_Seminars.OOP_seminar_3.TeacherGit.data.User;

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
