package Exception_Homework.Task_3.Data;



public class User {
    protected String userData;

    protected User(String userData) {
        this.userData = userData;
    }

    public String getUserData() {
        return userData;
    }

    public static User create(String userData) {
        return new User(userData);
    }

}
