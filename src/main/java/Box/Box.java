package Box;

public class Box {
    int length,width;
    Box(int length, int width){
        this.length = length;
        this.width = width;

    }
    int area(){
        return (length*width);
    }
}