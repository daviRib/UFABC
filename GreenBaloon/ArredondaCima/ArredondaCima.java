import java.util.Scanner;
import java.lang.Math;
public class ArredondaCima
{
    public static void main (String[] args)
    {
        double N, roundN;

        Scanner scanUniv = new Scanner(System.in); //Ler a linha inteira
        N = scanUniv.nextFloat();
        roundN =  Math.ceil(N);
        System.out.printf("%.4f\n", roundN);
    }
}