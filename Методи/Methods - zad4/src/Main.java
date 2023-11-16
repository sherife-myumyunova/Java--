import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете брой редове: ");
        int rows = scanner.nextInt();
        System.out.print("Въведете брой колони: ");
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                System.out.print("matrix [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println(SecondRowSum(matrix));
    }

    public static int SecondRowSum(int[][] arr)
    {
        int sum = 0;
        for (int j = 0; j < arr[1].length; j++)
        {
            sum += arr[1][j];
        }
        return sum;
    }
}