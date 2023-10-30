package Exception_Homework.Task_3.Exceptions;


public class GenderDataException extends Throwable{

    public final String genderData;

    public GenderDataException(String message, String genderData) {
        super(message);
        this.genderData = genderData;
    }

    public String getGenderData() {
        return genderData;
    }
}
