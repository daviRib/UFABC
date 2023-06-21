import java.util.Scanner;
import java.lang.Math;
public class Potenciacao
{
    public static void main (String[] args)
    {
        int A, N;
        double pot;

        Scanner scanUniv = new Scanner(System.in); //Ler a linha inteira
        A = scanUniv.nextInt();
        N = scanUniv.nextInt();
        pot = Math.pow(A, N);
        System.out.printf("%.4f\n", pot);
    }
}