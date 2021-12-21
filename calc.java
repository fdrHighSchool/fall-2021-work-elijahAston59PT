import java.util.*;
public class calc {
  public static String frac1;
  public static String frac2;

  public static int n1;
  public static int n2;
  public static int d1;
  public static int d2;


  public static void main(String[] args) {
    System.out.println("Fraction calc");
    System.out.print("Enter a problem: ");
    Scanner console = new Scanner(System.in);
    String problem = console.nextLine();

    produceAnswer(problem);
    //if (choice == 1){
      //addition();
  }

  public static String produceAnswer(String input){
    // TODO: Implement this function to produce the solution to the input
    // Checkpoint 1: Return the second operand.  Example "4/5 * 1_2/4" returns "1_2/4".
    int spacePosition = input.indexOf(" ");
    // System.out.println(spacePosition);

    String frac1 = input.substring(0, spacePosition);
    // System.out.println(frac1);

    String frac2 = input.substring(spacePosition + 3);
    System.out.println(frac2);
    // Checkpoint 2: Return the second operand as a string representing each part.
    //               Example "4/5 * 1_2/4" returns "whole:1 numerator:2 denominator:4".
    // Checkpoint 3: Evaluate the formula and return the result as a fraction.
    //               Example "4/5 * 1_2/4" returns "6/5".
    //               Note: Answer does not need to be reduced, but it must be correct.
    // Final project: All answers must be reduced.
    //               Example "4/5 * 1_2/4" returns "1_1/5".

    return "";
}//end produceAnswer method

//   public static String getOperation(){
//     System.out.print("Please enter an operation (+, -, /, *, = or Q to quit): ");
//     String operation = input.nextLine();
//
//     while(!operation.equals("+") && !operation.equals("-") && !operation.equals("/") && !operation.equals("*") && !operation.equals("=") && !operation.equalsIgnoreCase("q")){
//         System.out.print("Invalid input choose (+, -, /, *, = )only ");
//         operation = input.nextLine();
//     }
//
//     if (operation.equalsIgnoreCase("q")) {
//         System.exit(0); /*terminating program if the operation input is q or Q*/
//     }
//
//     return operation;
//   }
//
//
//   public static Fraction getFraction(){
//     System.out.print("Please enter a fraction (a/b) or integer (a): ");
//     String inputData = input.nextLine();
//
//     String[] inputParts = inputData.split("/");
//     int numInput = Integer.parseInt(inputParts[0]);
//     int denInput = Integer.parseInt(inputParts[1]);
//     return new Fraction(numInput, denInput);
// }
}
