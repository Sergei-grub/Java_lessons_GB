package Exception_Homework.Task_3.Exceptions;


public class PhoneNumDataException extends NullPointerException {

    public final String phoneNum;

    public PhoneNumDataException(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public PhoneNumDataException(String message, String phoneNum) {
        super(message);
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }
}
