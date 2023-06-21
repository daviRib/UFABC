import java.util.Scanner;

public class Hello2
{
    public static void main(String[] args)
    {
        String lastName;
        Scanner scanName = new Scanner(System.in);
        lastName = scanName.next();
        System.out.println("Hello " + lastName + ". Welcome!");
    }
}