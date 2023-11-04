import static java.lang.System.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[3][3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете елементите на масива: ");
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                System.out.print("array[" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Сума с повторение: " + diagonalsSum(array) + ", Сума без повторение: " + diagonalsSumWithoutCenter(array));
    }

    public static int diagonalsSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            sum += arr[i][arr.length-1-i];
        }
        return sum;
    }

    public static int diagonalsSumWithoutCenter(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            if(i != arr.length-1-i) {
                sum += arr[i][arr.length-1-i];
            }
        }
        return sum;
    }
}