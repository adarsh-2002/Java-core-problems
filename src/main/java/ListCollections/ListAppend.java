package ListCollections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListAppend {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<String> student1 = new LinkedList<>();
        List<String> student2 = new LinkedList<>();
        //Input the number of students in each class
        System.out.println("Enter the number of students in class 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the number of students in class 2: ");
        int n2 = sc.nextInt();
        //Input the names of the students in each class
        System.out.println("Enter the names of the students in class 1: ");
        for (int i = 0; i < n1; i++) {
            String name = sc.next();
            student1.add(name);
        }
        System.out.println("Enter the names of the students in class 2: ");
        for (int i = 0; i < n2; i++) {
            String name = sc.next();
            student2.add(name);
        }
        //Append the students in class 2 to class 1 and avoid duplicates
        for (int i = 0; i < student2.size(); i++) {
            if (!student1.contains(student2.get(i))) {
                student1.add(student2.get(i));
            }
        }
        //Print the students in class 1
        System.out.println("The students in class are: ");
        for (int i = 0; i < student1.size(); i++) {
            System.out.print(student1.get(i) + " ");
        }
    }
}
