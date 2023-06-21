import java.util.Scanner;
public class Universidade
{
    public static void main (String[] args)
    {
        String U;
        byte A;
        Scanner scanUniv = new Scanner(System.in); //Ler a linha inteira
        U = scanUniv.next();
        A = scanUniv.nextByte();

       System.out.println("Voce estuda na " + U + " ha " + A + " anos.");
    }
}