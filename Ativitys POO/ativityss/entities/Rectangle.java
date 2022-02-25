package entities;
import java.util.Math;

public class Rectangle {
    public double width;
    public double height;

    public double area() {
        return (width*height);
    }

    public double perimeter() {
        return (width*2) + (height*2);
    }

    public double diagonal() {
        double d = Math.pow(width, 2) + Math.pow(height, 2);
        double sqrtD = Math.sqrt(d);
        return sqrtD;
    }
}
