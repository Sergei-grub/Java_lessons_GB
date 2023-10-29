package Exception_Homework.Task_3.Data;

public class User {
    private String fio;
    private String birthday;
    private int phoneNumber;
    private char gender;

    public User(String fio, String birthday, int phoneNumber, char gender) {
        this.fio = fio;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return fio + ' ' +  birthday + ' ' + phoneNumber + ' ' + gender;
    }

    //Форматы данных:
    //фамилия, имя, отчество - строки
    //датарождения - строка формата dd.mm.yyyy
    //номертелефона - целое беззнаковое число без форматирования
    //пол - символ латиницей f или m.
}
