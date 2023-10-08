package Seminars.OOP_seminar_3.TeacherGit.controller;

import Seminars.OOP_seminar_3.TeacherGit.data.Student;
import Seminars.OOP_seminar_3.TeacherGit.data.Teacher;
import Seminars.OOP_seminar_3.TeacherGit.data.User;
import Seminars.OOP_seminar_3.TeacherGit.service.DataService;
import Seminars.OOP_seminar_3.TeacherGit.service.StudentGroupService;
import Seminars.OOP_seminar_3.TeacherGit.view.UserView;

import java.time.LocalDate;
import java.util.List;

public class UserController {

    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final UserView userView = new UserView();

    public void createStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
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
