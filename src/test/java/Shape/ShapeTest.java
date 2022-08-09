package Shape;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {
    @Test
    public void testShape() {
        Shape shape = new Shape();
        shape.draw();
        shape.erase();
    }

    @Test
    public void testCircle() {
        Circle circle = new Circle();
        circle.draw();
        circle.erase();
    }

    @Test
    public void testTriangle() {
        Triangle triangle = new Triangle();
        triangle.draw();
        triangle.erase();
    }

    @Test
    public void testSquare() {
        Square square = new Square();
        square.draw();
        square.erase();
    }
}
