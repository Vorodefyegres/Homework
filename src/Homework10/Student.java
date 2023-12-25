package Homework10;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private int grade;

    public Student(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public static void student(String[] args) {
    Student student1 = new Student(90);
    Student student2 = new Student(85);
    Student student3 = new Student(95);

    List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        System.out.println("Grades of students:");
        for (Student student : studentList) {
            System.out.println("Student grade: " + student.getGrade());
        }
    }
}