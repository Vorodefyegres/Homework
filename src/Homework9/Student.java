package Homework9;
public class Student {
    private String name;
    private int id;
    private int yearOfStudy;

    public Student(String name, int id, int yearOfStudy) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = yearOfStudy;
    }
    public String getName() {return name;}
    public int getId() {return id;}
    public void incrementYearOfStudy() {yearOfStudy++;}
}