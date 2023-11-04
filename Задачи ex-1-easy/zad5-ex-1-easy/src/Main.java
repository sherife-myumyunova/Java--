import static java.lang.System.*;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] num = new int[5];
        int max;
        max=num[0];
        System.out.println("Въведете стойности за елементите на масива: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<num.length; i++)
        {
            System.out.print("num[" + i + "]: ");
            num[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i<num.length; i++)
        {
            if(num[i]>max)
            {
                max = num[i];
            }
        }
        System.out.println("Максималният елемент на масива е: " + max);
    }
}