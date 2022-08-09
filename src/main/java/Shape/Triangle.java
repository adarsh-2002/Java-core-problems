package Shape;

public class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Inside Triangle::draw() method.");
    }
    @Override
    public void erase() {
        System.out.println("Inside Triangle::erase() method.");
    }
}
