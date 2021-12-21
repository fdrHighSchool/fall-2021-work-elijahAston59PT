import java.util.*;
import java.util.stream.IntStream;

public class average {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10 };
        int[] arr2 = {90, 100};
        int min = getMin(arr);


        System.out.println("Minimum Value is: "+min);
        System.out.println("The average is:" + average(arr));
        System.out.println("The average is:" + average(arr2));
        //System.out.println(mode(arr.IndexOf(max)));
      //  System.out.println("the range is:" + range(arr));
    }


    public static double average(int[] arr) {
      double total = 0;

      for(int i=0; i<arr.length; i++){
        total = total + arr[i];
      }

      double average = total / arr.length;

      return average;

    }
  public static int mode(int[] arr) {

    int max = findMax(arr);
    int [] freq = new int[max + 1];
    for(int i = 0; i < arr.length; i++) {
      freq[arr[i]]++;
    } // end for loop

    System.out.println(Arrays.toString(freq));
    return 0;
  } // end of mode method

    public static int findMax(int[] arr) {

     int max = -9999999;

     for(int i = 0; i < arr.length; i++) {
      if(arr[i] > max) {
        max = arr[i];
       }
    }
    return max;
  }
   public static void range(String[] args) {

   }

  public static int getMin(int[] arr){
    int minValue = inputArray[0];
    for(int i = 0;i<arr.length;i++){
      if(arr[i] < minValue){
        minValue = arr[i];
      }
    }
    return minValue;
  }

   }
}




}
