import static java.lang.System.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] num = new int[3];
        int sum=0;
        System.out.println("Въведете стойности за елементите на масива: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<num.length; i++)
        {
            System.out.print("num[" + i + "]: ");
            num[i] = scanner.nextInt();
        }
        scanner.close();

        for(int i=0; i<num.length; i++)
        {
            sum+=num[i];
        }
        System.out.println("Сумата на елементите е: " + sum);
    }
}