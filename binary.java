public class BinaryToDecimal
{
    public static void main(String args[])
    {
        double[] arr = {1,0,0};
       double decimal = 10;
        decimal = converter(arr);
        System.out.println(decimal);

    }

    public static double converter(double [] array)
    {
        int exponent = 0;
        double decimal = 0;
        for (int position = array.length - 1; position >= 0; position--)
        {
           // System.out.println(exponent);
            decimal = Math.pow(2, exponent) * array[position] + decimal;
            exponent = exponent + 1;
           //System.out.println(array[position]);
        }
        return(decimal);

    }
}
