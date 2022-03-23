public class Aufgabe2
{
public static void main (String[] args)
    {
        long zahl = 16;
        System.out.println(String.valueOf(zahl));

        for (int i = 0; i<6; i++)
        {
            zahl = zahl * zahl;
            System.out.println(zahl);
        }
    }
}