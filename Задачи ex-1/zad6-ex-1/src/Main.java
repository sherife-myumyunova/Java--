import static java.lang.System.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;

        System.out.print("Въведете височина: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        Triangle(num);
    }

    public static void Triangle(int n) {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                while(j<i)
                {
                    System.out.print("* ");
                    break;
                }
            }
            System.out.println();
        }
    }
}
