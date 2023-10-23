package OOP_Homework.Task_4;

import OOP_Homework.Task_4.controller.TeacherController;


public class Main {

    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();
//        teacherController.ceate("Владимир", "Орлов", "Гертрудович", "11.12.1955");
        teacherController.ceate("Сергей", "Иванов", "Константинович", "21.12.1977");
        teacherController.ceate("Константин", "Гончаров", "Сергеевич", "11.12.1981");
        teacherController.ceate("Владимир", "Путин", "Владимирович", "07.10.1952");
        teacherController.teacherView();
        System.out.println("__________________________________");
        teacherController.delUser(0);
        teacherController.teacherView();

//        teacherController.setUser(1, "Владимир", "Орлов", "Гертрудович", "11.12.1955"); // В работе


    }

}