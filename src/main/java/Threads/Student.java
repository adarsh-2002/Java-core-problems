package Threads;

public class Student {
    static int id = 0;
    private String name, subject;
    int marks;
    public Student(String name, String subject, int marks) {
        this.name = name;
        this.subject = subject;
        this.marks = marks;
        id++;
    }
    public String getName() {
        return name;
    }
    public String getSubject() {
        return subject;
    }
    public int getMarks() {
        return marks;
    }

}
