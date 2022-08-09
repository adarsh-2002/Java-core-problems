package Box;
import Box.Box;
import Box.Box3d;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(10,20);
        System.out.println("Area of Box is: " + box.area());
        Box3d ob = new Box3d(10,20,30);
        System.out.println("The Area of Box3d is   = "+ob.area());
        System.out.println("The Volume of Box3d is = "+ob.volume());
    }
}