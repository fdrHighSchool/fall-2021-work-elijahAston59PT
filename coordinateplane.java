package circles;
import java.util.Scanner;

public class MathCircles {
    // variable for the distance between the circles' centers
    public static int distance;

    // variable for the lengths of the radii combined
    public static int radii;

    public static void main(String[] args) {
        // Get the x-value of the center of circle one
        System.out.println("What is the x-coordinate for the center of circle one?");
        Scanner keyboard = new Scanner(System.in);
        int x1 = keyboard.nextInt();

        //Get the y-value of the center of circle one
        System.out.println("What is the y-coordinate for the center of circle one?");
        Scanner keyboard1 = new Scanner(System.in);
        int y1 = keyboard1.nextInt();

        //Get the radius length of circle one.
        System.out.println("How long is circle one's radius?");
        Scanner keyboard2 = new Scanner(System.in);
        int r1 = keyboard2.nextInt();

        // Get the x-value of the center of circle two.
        System.out.println("What is the x-coordinate for the center of circle two?");
        Scanner keyboard3 = new Scanner(System.in);

        //Get the y-value of the center of circle two.
        System.out.println("What is the y-coordinate for the center of circle two?");
        Scanner keyboard4 = new Scanner(System.in);
        int y2 = keyboard4.nextInt();

        //Get the radius length of circle two.
        System.out.println("How long is circle two's radius?");
        Scanner keyboard5 = new Scanner(System.in);
        int r2 = keyboard5.nextInt();

        /*
         * OK, so now I have the location of the two circles' centers,
         * as well as the lengths of their radii.
         * The circles are intersecting IF THE DISTANCE BETWEEN THE TWO CENTERS
         * IS EQUAL TO OR LESS THAN THE COMBINED LENGTHS OF THE RADII.
         * Now I need to get some math done.
         */

        //calculate the combined lengths of the radii

        radii = r1 + r2;
        distance = Math.sqrt((x1-x2)(x1-x2) + (y1-y2)(y1-y2));

           }
       }
