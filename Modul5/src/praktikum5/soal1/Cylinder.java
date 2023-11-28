package praktikum5.soal1;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    //------------------------------------
    // Constructor: Sets up the cylinder.
    //------------------------------------

    public Cylinder(double r, double h) {
        super("Cylinder");
        this.radius = r;
        this.height = h;
    }

    //--------------------------------------------
    // Returns the surface area of the cylinder.
    //--------------------------------------------

    @Override
    public double area() {
        return Math.PI*radius*radius*height;
    }

    //------------------------------------
    // Returns the cylinder as a String.
    //------------------------------------

    @Override
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}