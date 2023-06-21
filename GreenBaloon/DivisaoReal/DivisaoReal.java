import java.util.Scanner;
public class DivisaoReal
{
    public static void main(String[] args)
    {
        float numA, numB, div;
        Scanner scan = new Scanner(System.in);
        numA = scan.nextFloat();
        numB = scan.nextFloat();
        div = numA/numB;
        System.out.printf("%.4f\n", div);
    }
}