package OOP_Homework.Task_5.Controler;

import OOP_Homework.Task_5.Data.*;
import OOP_Homework.Task_5.Service.DataService;
import OOP_Homework.Task_5.Service.StudyGroupService;
import OOP_Homework.Task_5.View.StudentView;

import java.util.List;

public class Controler {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudyGroupService studyGroupService;

    public Controler(){
        this.studyGroupService = new StudyGroupService();
    }


    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.STUDENT);
    }

    public StudyGroup createStudyGroupTeacherAndStudents(Teacher teacher, List<Student> students){
        return studyGroupService.createStudyGroup(teacher, students);

    }
    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user: userList){
            studentView.printOnConsole((Student) user);
        }
    }
}
