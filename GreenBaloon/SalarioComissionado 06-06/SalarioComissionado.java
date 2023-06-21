import java.lang.Math;
import java.util.Scanner;
public class SalarioComissionado
{
    public static void main(String[] args)
    {
        float S, V, PC, TotalComissaoV, SL;

        Scanner scanSal = new Scanner(System.in); //Ler a linha inteira

        S = scanSal.nextFloat();
        V = scanSal.nextFloat();

        PC = scanSal.nextFloat();

        TotalComissaoV = (V * PC)/100.f;

        SL = S+TotalComissaoV;

        System.out.printf("%.2f\n", SL);
    }
}