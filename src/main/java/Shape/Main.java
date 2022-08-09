package Shape;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle();
        shapes[1] = new Triangle();
        shapes[2] = new Square();
        shapes[3] = new Shape();
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
            shapes[i].erase();
        }
    }
}
