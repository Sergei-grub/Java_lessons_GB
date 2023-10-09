package OOP_Homework.Task_3.model;

public class Group {
    private int groupNum;
    private String groupName;
    private int countOfStudents;

    public Group(int groupNamb, String groupName, int countOfStudents) {
        this.groupNum = groupNamb;
        this.groupName = groupName;
        this.countOfStudents = countOfStudents;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getCountOfStudents() {
        return countOfStudents;
    }

    public void setCountOfStudents(int countOfStudents) {
        this.countOfStudents = countOfStudents;
    }

    @Override
    public String toString() {
        return "Group: " +
                "groupNam = " + groupNum +
                ", groupName ='" + groupName + '\'' +
                ", countOfStudents =" + countOfStudents;
    }
}
