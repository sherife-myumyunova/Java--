import static java.lang.System.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        boolean prime = true;


        System.out.print("Въведете число: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        for(int i = 2; i <= Math.sqrt(num); i++)
        {
            if(num % i == 0)
            {
                prime = false;
                break;
            }
        }

        if(prime)
        {
            System.out.println(num + " е просто число!");
        }
        else
        {
            System.out.println(num + " не е просто число!");
        }
    }
}