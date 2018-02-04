package fundamentals.labs;

/**
 * Fundamentals Exercise 4: Area and Perimeter
 *
 *      Write the necessary code to calculate the area and perimeter of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {


            double radius = 3.14;
            double height = 5;

            double perimeter = 2*Math.PI*radius;
            double area = perimeter*(radius+height);

            System.out.println("Perimeter =: " + perimeter);
            System.out.println("Area =: " + area);



    }
}
