package praktikum5.soal1;

public class Rectangle extends Shape{
    private double length;
    private double width;

    //------------------------------------
    // Constructor: Sets up the rectangle.
    //------------------------------------

    public Rectangle(double l, double w) {
        super("Rectangle");
        this.length = l;
        this.width = w;
    }

    //--------------------------------------------
    // Returns the surface area of the rectangle.
    //--------------------------------------------

    @Override
    public double area() {
        return length * width;
    }

    //------------------------------------
    // Returns the rectangle as a String.
    //------------------------------------

    @Override
    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;
    }
}