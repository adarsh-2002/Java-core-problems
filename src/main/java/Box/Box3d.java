package Box;
import Box.Box;

public class Box3d extends Box {
    int height;
    Box3d(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }
    int volume(){
        return (super.area()*height);
    }
}