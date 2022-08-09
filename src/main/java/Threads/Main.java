package Threads;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;

public class Main implements Runnable {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static List<Student> students = new LinkedList<Student>();

    private synchronized void readCsv() {
        String line = "";
        String splitBy = ",";
        try {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(splitBy);
                students.add(new Student(data[0], data[1], Integer.parseInt(data[2])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private synchronized void writeGrade() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("C://users/adars/Downloads/Java core problems/src/main/java/Threads/grades.csv"));
            for (Student student : students) {
                //Find grade
                String grade = "";
                if (student.marks >= 90) {
                    grade = "A";
                } else if (student.marks >= 80) {
                    grade = "B";
                } else if (student.marks >= 70) {
                    grade = "C";
                } else if (student.marks >= 60) {
                    grade = "D";
                } else {
                    grade = "F";
                }
                pw.println(student.getName() + "," + student.getSubject() + "," + student.getMarks() + "," + grade);
            }
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        Thread thread = new Thread(main);
        try {
            BufferedReader br = new BufferedReader(new FileReader("C://users/adars/Downloads/Java core problems/src/main/java/Threads/students.csv"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        thread.start();
        for(Student student : students) {
            System.out.println(student.getName() + " " + student.getSubject() + " " + student.getMarks());
        }
    }
    @Override
    public void run() {
        try  {
            readCsv();
            writeGrade();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

