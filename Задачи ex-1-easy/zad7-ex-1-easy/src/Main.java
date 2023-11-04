import static java.lang.System.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] num = new int[2][2];
        int firstRowSum = 0;

        System.out.println("Въведете стойности за елементите на масива: ");
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < num.length; i++)
        {
            for(int j = 0; j < num[0].length; j++)
            {
                System.out.print("num[" + i + "][" + j + "]: ");
                num[i][j] = scanner.nextInt();
            }
        }

        for(int j = 0; j < num.length; j++)
        {
            firstRowSum += num[0][j];
        }

        System.out.println("Сумата на елементите на първия ред е " + firstRowSum);

    }
}