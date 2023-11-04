import static java.lang.System.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;

        System.out.print("Въведете число: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if(num%2==0)
        {
            System.out.println("Четно!");
        }
        else
        {
            System.out.println("Нечетно!");
        }

    }
}