import java.math.BigInteger;

public class BigInt 
{
    public static void main (String[] args)
    {
    BigInteger bigInt = new BigInteger("16");
    System.out.println(String.valueOf(bigInt));

        for (int i=0; i<6; i++);
        {
            bigInt = bigInt.multiply(bigInt);
            System.out.println(bigInt);
        }
    }
}
