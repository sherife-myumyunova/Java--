import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sacnner = new Scanner(System.in);
        System.out.print("Въведете число: ");
        int num = sacnner.nextInt();
        System.out.printf("Факториел на %d е %d", num, Factorial(num));

    }

    public static int Factorial(int n)
    {
        int fact = 1;
        for(int i = 1; i <= n; i++)
        {
            fact *= i;
        }
        return fact;
    }
}