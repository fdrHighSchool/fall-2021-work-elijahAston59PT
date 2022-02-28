import java.util.Scanner;

class metrocard
{
int funds = 0;

public static int addfunds()
{
    System.out.println("add funds to metrocard");
    Scanner scan = new Scanner(System.in);

        funds = scan.nextInt();


    return(funds);
}

public static double swipes()
{
    int fair = 2;
    int newfunds = funds - fair;
    funds = newfunds;
    return(funds);
}
  public static boolean checkfunds()
  {
    if (funds >= 2) {
        return(true);
    }
    else{
        return(false);
    }

  }
}

class main
    {
        metrocard school = new metrocard();

        boolean m = school.checkfunds();
        System.out.println(m);

         if (m == false)

            int x = school.addfunds();
            System.out.println("you now have" + x);

          else
            System.out.println("you can go");
        }
        double r = school.swipes();
        System.out.println(r);
        r = school.swipes();
        System.out.println(r);
        r = school.swipes();
        System.out.println(r);
}
