package praktikum5.soal1;

import java.text.DecimalFormat;

public class PaintThings {
    //-----------------------------------------
    //Creates some shapes and a Paint object
    //and prints the amount of paint needed
    //to paint each shape.
    //-----------------------------------------
    public static void main (String[] args) {
        final double COVERAGE = 350.0;

        Paint paint = new Paint(COVERAGE);

        Rectangle deck;
        Sphere bigBall;
        Cylinder tank;
        double deckAmt, ballAmt, tankAmt;

        //Instantiate the three shapes to paint
        deck = new Rectangle(20.0, 30.0);
        bigBall = new Sphere(15.0);
        tank = new Cylinder(10.0, 30.0);

        //Compute the amount of paint needed for each shape
        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);

        //Print the amount of paint for each.
        DecimalFormat fmt = new DecimalFormat("0.#");

        System.out.println ("\nNumber of gallons of paint needed...");
        System.out.println ("Deck " + fmt.format(deckAmt));
        System.out.println ("Big Ball " + fmt.format(ballAmt));
        System.out.println ("Tank " + fmt.format(tankAmt));

        System.out.println("\n");
        System.out.println(fmt.format(paint.amount(deck)) + " gallon(s)");
        System.out.println(fmt.format(paint.amount(bigBall)) + " gallon(s)");
        System.out.println(fmt.format(paint.amount(tank)) + " gallon(s)");
    }
}