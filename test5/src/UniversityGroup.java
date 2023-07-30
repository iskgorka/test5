import java.util.ArrayList;

public class UniversityGroup {
    private String groupName;
    private int startYear;
    private int endYear;
    private ArrayList<String> studentList = new ArrayList<String>();

    String getGroupName() {
        return groupName;
    }

    int getStartYear() {
        return startYear;
    }

    int getEndYear() {
        return endYear;
    }

    ArrayList<String> getStudentList() {
        return studentList;
    }

    UniversityGroup(String groupName, int startYear) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.endYear = this.startYear + 5;
    }

    UniversityGroup(String groupName, int startYear, ArrayList<String> studentList) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.studentList = studentList;
        this.endYear = this.startYear + 5;
    }

    void addStudent(String student) {
        studentList.add(student);
    }

    boolean removeStudent(String student) {
        if (studentList.contains(student)) return studentList.remove(student);
        else return false;
    }

    void getGroupDescription() {
        System.out.println("Имя группы : " + getGroupName() + "\n" +
                "Год поступления: " + getStartYear() + "\n" +
                "Год выпуска: " + getEndYear() + "\n" +
                "Список студентов: " + getStudentList());
    }

}

class UniversityGroupDemo {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Prishchepa");
        students.add("Bieloysov");
        students.add("Chernysh");
        UniversityGroup group1 = new UniversityGroup("КІТ 106.8", 2018);
        UniversityGroup group2 = new UniversityGroup("КН-Н 1022в", 2022, students);
        group2.getGroupDescription();
    }
}
