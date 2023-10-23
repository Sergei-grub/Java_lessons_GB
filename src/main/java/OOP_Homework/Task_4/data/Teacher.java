package OOP_Homework.Task_4.data;


public class Teacher extends User implements Comparable<Teacher>{
    private Long teachertId;

    @Override
    public int compareTo(Teacher o) {
        if (this.teachertId == o.teachertId)
            return 0;
        if (this.teachertId < o.teachertId)
            return  -1;
        return 1;
//        return this.studentId.compareTo(o.studentId);
    }

    public Teacher(String firstName, String secondName, String patronymic,
                   String dateOfBirth, Long teachertId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teachertId = teachertId;
    }

    public Long getTeachertId() {
        return teachertId;
    }

    public void setTeachertId(Long teachertId) {
        this.teachertId = teachertId;
    }

    @Override
    public String toString() {
        return "\nПреподаватель: " +
                "Id = " + teachertId +
                "\n Фамилия='" + super.getSecondName() + '\'' +
                "\n Имя ='" + super.getFirstName() + '\'' +
                "\n Отчество ='" + super.getPatronymic() + '\'' +
                "\n dateOfBirth =" + super.getDateOfBirth();
    }
}

