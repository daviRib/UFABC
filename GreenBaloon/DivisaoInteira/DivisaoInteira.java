import java.util.Scanner;
public class DivisaoInteira
{
    public static void main(String[] args)
    {
        int numA, numB;
        Scanner scan = new Scanner(System.in);
        numA = scan.nextInt();
        numB = scan.nextInt();
        System.out.println(numA/numB);
    }
}