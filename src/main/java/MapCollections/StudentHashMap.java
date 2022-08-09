package MapCollections;
import java.util.*;

public class StudentHashMap {
    public static void searchStudent(Map<Integer, Student> hm, String name) {
        if (hm.containsKey(name)) {
            System.out.println("Student found: " + hm.get(name));
        } else {
            System.out.println("Student not found");
        }
    }
    public static void fetchStudent(Map<Integer, Student> hm, String name) {
        if (hm.containsKey(name)) {
            System.out.println("Student found: " + hm.get(name));
            System.out.println("Student email: " + hm.get(name).getEmail());
        } else {
            System.out.println("Student not found");
        }
    }
    public static Map<Integer, Student> sortStudents(Map<Integer, Student> hm) {
        Map<Integer, Student> sorted = new TreeMap<>(hm);
        return sorted;
    }

    public static void main(String[] args) {
        Map<Integer, Student> hm = new HashMap<Integer, Student>();
        hm.put(1, new Student("Adarsh", "adarsh@gmail.com"));
        hm.put(2, new Student("Ram", "ram@gmail.com"));
        hm.put(3, new Student("Preethi", "preethi@gmail.com"));
        fetchStudent(hm, "Adarsh");
        searchStudent(hm, "Adarsh");
        hm = sortStudents(hm);
        System.out.println("Sorted hashmap: " + hm);
    }
}
