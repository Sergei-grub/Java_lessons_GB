package OOP_Homework.Task_4.controller;

import OOP_Homework.Task_4.data.Teacher;
import OOP_Homework.Task_4.service.TeacherService;
import OOP_Homework.Task_4.view.TeacherView;

public class TeacherController implements iUserController<Teacher> {
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void ceate(String firstName, String secondName, String patronymic, String dateOfBirth) {
        teacherService.create(firstName, secondName, patronymic, dateOfBirth);
    }
    public void teacherView(){
        teacherView.sendOnConsole(teacherService.getAll());
    }
    public void delUser(int u){
        teacherService.dellUser(u);
    }
//    public void setUser(int u){
//        teacherService.setUser(u);
//    }

}
