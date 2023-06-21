import java.util.Scanner;
import java.lang.Math;
public class Absoluto
{
    public static void main (String[] args)
    {
        long A, absA;

        Scanner scanUniv = new Scanner(System.in); //Ler a linha inteira
        A = scanUniv.nextLong();

        absA = Math.abs(A);
        System.out.println(absA);
    }
}