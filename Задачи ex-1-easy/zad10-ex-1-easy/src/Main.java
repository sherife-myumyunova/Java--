import static java.lang.System.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;

        System.out.print("Въведете число: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if(num < 0)
        {
            System.out.println("Отрицателно!");
        }
        else if(num > 0)
        {
            System.out.println("Положително!");
        }
        else
        {
            System.out.println("Нито положително, нито отрицателно!");
        }

    }
}