import static java.lang.System.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2;

        System.out.print("Въведете първото число: ");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        System.out.print("Въведете второто число: ");
        num2 = scanner.nextInt();
        if(num1 == num2)
        {
            System.out.println("Равни!");
        }
        else
        {
            System.out.println("Различни!");
        }

    }
}