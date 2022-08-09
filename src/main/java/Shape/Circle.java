package Shape;

public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
    @Override
    public void erase() {
        System.out.println("Inside Circle::erase() method.");
    }
}
