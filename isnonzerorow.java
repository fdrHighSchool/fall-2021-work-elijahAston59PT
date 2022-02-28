public class isNonzeroRow{

public static void isNonzeroRow(int[][], int R){

if(int c = 0; c < array[r].length; c++){
   if (array[r][c] == 0){
   return false;
    else return true
   }
}


}
public static int [][] resize (int[][] array){
int numRows = array.length;
int numCols = array[0].length;

int [][] result = new int[numNonZerorow(array2D)][numCols];
int newRowIndex = 0;

for (int r = 0; r < numRows; r++){
  if(isNonzeroRow(array2D, r))
  {
   for (int c = 0; c < numCols; c++){

   result[newRowIndex][c] = array2D[r][c];

   }
   newRowIndex++
  }
}
return result;
}

}
