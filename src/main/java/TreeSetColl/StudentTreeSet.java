package TreeSetColl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.TreeSet;
import java.util.Set;
import java.util.logging.Level;

public class StudentTreeSet {
    public static void main(String args[]) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C://users/adars/Downloads/Java core problems/src/main/java/TreeSetColl/Sample"));
            String line;
            TreeSet<String> ts = new TreeSet<>();
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    ts.add(word);
                }
            }
            System.out.println("The words in the file are: ");
            for (String word : ts) {
                System.out.print(word + " ");
            }
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(StudentTreeSet.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }
}
