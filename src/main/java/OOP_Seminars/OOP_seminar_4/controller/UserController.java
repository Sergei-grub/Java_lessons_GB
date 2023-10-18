package OOP_Seminars.OOP_seminar_4.controller;

import OOP_Seminars.OOP_seminar_4.Student;
import OOP_Seminars.OOP_seminar_4.Teacher;
import OOP_Seminars.OOP_seminar_4.User;
import OOP_Seminars.OOP_seminar_4.service.DataService;
import OOP_Seminars.OOP_seminar_4.service.StudentGroupService;
import OOP_Seminars.OOP_seminar_4.view.UserView;

import java.time.LocalDate;
import java.util.List;

public class UserController {

    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final UserView userView = new UserView();

    public void createStudent(String firstName, String secondName, String patronymic, String dateOfBirth){
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        List<User> userList = dataService.getAll();
        userView.sendOnConsole(userList);
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
    }

    public Student getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    }

    public List<Student> getSortedListStudentFromStudentGroup(){
        return studentGroupService.getSortedStudentGroup();
    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
        return studentGroupService.getSortedByFIOStudentGroup();
    }
}
