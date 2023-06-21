import java.util.Scanner;
import java.lang.Math;
public class ArredondaBaixo
{
    public static void main(String[] args)
    {
        float N, roundN;

        Scanner scanUniv = new Scanner(System.in); //Ler a linha inteira
        N = scanUniv.nextFloat();
        roundN = (float) Math.floor(N);
        System.out.printf("%.4f\n", roundN);
    }
}