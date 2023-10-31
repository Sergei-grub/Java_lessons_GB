package Exception_Homework.Task_3.Exceptions;

public class BirthdayException extends Throwable {
    public final String birthday;

    public BirthdayException(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }


}
