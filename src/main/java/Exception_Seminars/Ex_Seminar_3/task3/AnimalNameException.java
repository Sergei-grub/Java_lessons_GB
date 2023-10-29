package Exception_Seminars.Ex_Seminar_3.task3;

public class AnimalNameException extends AnimalException{

    private final String name;

    public String getName() {
        return name;
    }

    public AnimalNameException(String message, String name) {
        super(message);
        this.name = name;
    }
}
