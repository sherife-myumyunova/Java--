import static java.lang.System.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int[] array;
        int num;
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете число: ");
        num = scanner.nextInt();
        System.out.print("Въведете дължина на масива: ");
        n = scanner.nextInt();
        array = new int[n];
        System.out.println("Въведете елементите на масива: ");
        for(int i = 0; i < array.length; i++){
            System.out.print("array[" + i + "]: ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Сума: " + arrSum(array) + ", Четни: " + evenNumbersSum(array) + ", Нечетни: " + oddNumbersSum(array));
        System.out.print(", Обърнат: ");
        printArray(reversedArray(array));
        MinAndMax(array);
        System.out.print(", Просто: " + Prime(num));
        System.out.print(", Сума на диагоналите с повторение: " + diagonalsSum(matrix) + ", Сума без повторение: " + diagonalsSumWithoutCenter(matrix));
    }

    public static int arrSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int evenNumbersSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int oddNumbersSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int[] reversedArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - i - 1];
        }
        return reversed;
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void MinAndMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print(", Макс: " + max + ", Мин: " + min);
    }

    public static boolean Prime(int n) {
        boolean prime = true;
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                prime = false;
                break;
            }
        }

        if(prime)
        {
            return true;
        }
        else
        {
            return false;
        }
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