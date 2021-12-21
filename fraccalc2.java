import java.util.*;

public class fraccalc2 {

  public static void main(String[] args){

    Scanner s = new Scanner(System.in);
    System.out.print("enter a fraction problem: ");
    String user = s.nextLine();

    System.out.println(Answer(user));
  }

  public static String Answer(String input)
  {
    String temp = input;
    String frac1 = temp.substring(0, temp.indexOf(" "));
    String operation = temp.substring(temp.indexOf(" ")+1, temp.indexOf(" ")+2);
    String frac2 = temp.substring(temp.indexOf(" ") + 3);

    String frac2whole = getWhole(frac2);
    String frac2num = getnum(frac2);
    // String frac2dem = getdem(frac2);
    // String Answer = "whole" + frac2whole + "numerator:"+ frac2num + "denominator:" + frac2dem;
    return operation;
  } // end Answer method

  public static String getWhole(String str) {

    if (str.contains("_")) {
      return str.substring (0, str.indexOf("_"));
    }

    if(str.contains("/")) {
      return("0");
    }

    else {
      return(str);
    }
  }

  public static String getnum(String[] str){
     if(str.contains("_")){
       return str.substring (str.indexOf("_") + 1, str.indexOf(""/""));
     }
  //
  //   if(string.contains(""/"")){
  //     return str.substring (0, str.indexOf(""/""));
  //   }
  //
  //   else {
  //     return(0);
  //   }
  // }
  //
  // public static String getdem(String[] str){
  //   if(str.contains(""/"")){
  //     return str.substring (str.indexOf("/") + 1);
  //   }
  //
  //   else{
  //     return(1);
  //   }
  // }

}

}
