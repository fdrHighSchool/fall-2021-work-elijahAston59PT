import java.util.*;
import java.util.stream.IntStream;

public class average {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10 };
        int[] arr2 = {90, 100};



        System.out.println("The average is:" + average(arr));
        System.out.println("The average is:" + average(arr2));
        System.out.println("The maximum value of arr is"+ findMax(arr));
      //  System.out.println("the range is:" + range(arr));
        System.out.println("the median is:" + median(arr));
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
    public static int median(int[] arr){
      if (arr.length%2 == 1){
        return arr[arr.length/2];
      }
      else{
        //{1,2,3,4} size=4
        //take 2, take 3
        int topH=arr.length/2;
        int botH=arr.length/2 -1;
        //2-> index1 ,3-> index2
        //4/2=index 2->3
        return (topH+botH)/2;
        //index 2-1=index 1->2
        //return (index2+ index1)1/2
      }

    }



}
