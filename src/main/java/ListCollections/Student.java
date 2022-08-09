package ListCollections;
import java.util.*;

public class Student {
    public static void main(String args[]) {
        ArrayList<String> student = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        //handle error if user enters 0 or negative number or character
        int n = sc.nextInt();
        if(n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        for(int i = 0; i < n; i++) {
            System.out.println("Enter the name of the student: ");
            //Check if already present
            String name = sc.next();
            if(student.contains(name)) {
                System.out.println("Student already present");
            } else {
                student.add(name);
            }
        }
        System.out.println("The students are: ");
        for(int i = 0; i < student.size(); i++) {
            System.out.print(student.get(i) + " ");
        }

        System.out.println("Enter name to search");
        String name = sc.next();
        if(student.contains(name)) {
            System.out.println("Student found");
        } else {
            System.out.println("Student not found");
        }

    }
}
