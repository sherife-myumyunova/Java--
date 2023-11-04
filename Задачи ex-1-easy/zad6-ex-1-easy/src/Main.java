import static java.lang.System.*;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[][] num = new int[2][2];
        int sum1 = 0, sum2 = 0;
        System.out.println("Въведете стойности за елементите на масива: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < num.length; i++)
        {
            for(int j = 0; j < num[0].length; j++)
            {
                System.out.print("num[" + i + "][" + j + "]: ");
                num[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        for (int i = 0; i < num.length; i++)
        {
            sum1 += num[i][i];
        }
        for (int i = 0; i < num.length; i++)
        {
            sum2+=num[i][num.length-1-i];
        }
        System.out.println("Сумата от елемент на главния диагонал е: " + sum1);
        System.out.println("Сумата от елемент на второстепенния диагонал е: " + sum2);
        System.out.println(num.length);
        System.out.println(num[0].length);
    }
}