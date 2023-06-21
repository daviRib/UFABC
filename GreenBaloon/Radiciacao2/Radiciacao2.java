import java.util.Scanner;
import java.lang.Math;
public class Radiciacao2
{
    public static void main (String[] args)
    {
        long A;
        double raiz;

        Scanner scanUniv = new Scanner(System.in); //Ler a linha inteira
        A = scanUniv.nextLong();
        raiz = Math.sqrt(A);
        System.out.printf("%.4f\n", raiz);
    }
}