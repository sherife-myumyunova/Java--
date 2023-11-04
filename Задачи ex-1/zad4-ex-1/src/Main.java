import static java.lang.System.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;

        System.out.print("Въведете число: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        System.out.println("Просто: " + Prime(num));
    }

    public static boolean Prime(int n) {
        boolean prime = true;
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                prime = false;
                break;
            }
        }

        if(prime)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}