package OOP_Homework.Task_6.SRP;

// Принципы SOLID
// S – Single Responsibility (Принцип единственной ответственности)
// Расчет зарплаты был исключен из класса работники и перенесен в отдельный класс "EmployeeSalaryCalculate".
public class Employee {
    private String name;
    private String dol;



    public Employee(String name, String dol) {
        this.name = name;
        this.dol = dol;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDol() {
        return dol;
    }

    public void setDol(String dol) {
        this.dol = dol;
    }


}
