import static java.lang.System.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;

        System.out.print("Въведете число: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if(num > 10)
        {
            System.out.println("По-голямо от 10");
        }
        else if(num == 10)
        {
            System.out.println("Въведенето число е 10");
        }
        else
        {
            System.out.println("По-малко от 10");
        }

    }
}