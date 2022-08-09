package Shape;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
    @Override
    public void erase() {
        System.out.println("Inside Square::erase() method.");
    }
}
