package Exception_Homework.Task_3.Exceptions;


public class NumDataException extends Throwable {

    public final String data;

    public NumDataException(String message, String data) {
        super(message);
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
