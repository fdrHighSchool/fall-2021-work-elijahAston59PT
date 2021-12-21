import java.util.Scanner;

public class Guessing{
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);



     int number = (int)(100 * Math.random() + 1);

     int X = 5;

     int i, guess;

     System.out.println("choose between 1 to 100 within 5 trys");

     for (i = 0; i < X; i++){

       System.out.println("guess the number:");

       guess = sc.nextInt();

       if (number == guess) {
           System.out.println("you win");
         break;

       }
       else if (number > guess) {
         System.out.println("the numbner is greater than" + guess);
       }

       else if (number < guess) {
         System.out.println("the number is less than" + guess);

       }

     }

     if (i == X) {
       System.out.println(" you ran out of lives");
       System.out.println(" the number was" + number);
     }

   }
 }
