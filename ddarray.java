import java.util.*;
public class ddarray{
 public static void main(String args[]){


 int [][] studentGrades = new int[15][5];
 System.out.println(studentGrades[studentGrades.length-1][studentGrades[0].length-1]);
 System.out.println(studentGrades.length);
 System.out.println(studentGrades[0].length);

 int num = 1;
 for(int row = 0; row < studentGrades.length; row++){
 for(int col = 0; col < studentGrades[0].length; col++){
 studentGrades[row][col] = num;
 num++
 }
 }
 System.out.println(studentGrades[studentGrades.length-1][studentGrades[0]-1]);
 System.out.println(array.deepToString(studentGrades));

 }
}
