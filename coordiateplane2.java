import java.util.*;

public class coordinateplane{
  public static void main(String[] args){

  Scanner s = new Scanner(System.in);

System.out.println("which of the following do want?")
System.out.println("1.distance calculator, or 2.area calculator")

int choice = s.nextInt();

if (choice == 1){
  distance();
}
else {
  area();
}

public static void distance(){

Scanner s = new Scanner(System.in);

  System.out.print("please input a coordinate");
  String point = s.nextline();

  int x1 = getX(point1);
  int y1 = getY(point1);

  System.out.print("please input another coordinate");
  String point2 = s.nextLine();

  int x2 = getX(point2);
  int y2 = getY(point2);

  crowsDistance(x1, y1, x2, y2);
  taxicabDistance(x1, y1, x2, y2);

public static void area() {
  Scanner s = new Scanner(System.in);
  System.out.println("what shape do you want to know the area of?");
  System.out.println("1. Square\n");

  int choice = s.nextInt();

  if (choice == 1) {
    Square();
  }
   if(x2 - x1 == 0){
     System.out.println("undefined");
   }


  public static void square() {
    Scanner s = new Scanner(System.in);
  }
 public static double slope(int x1, int y1, int x2, int y2,){
   Scanner s = new Scanner(System.in);
   if (x1 == x2)
      return Inter.MAX_VALUE;
      retun (y2 - y1)/(x2 - x1);
      if (x1 != x2){
        return (y2 - y1)/(x2 - x1);
      }

        return 0.0

    int x3 = getX(point 3);
    int y3 = getY(point 3);



 }

}
  }
}
