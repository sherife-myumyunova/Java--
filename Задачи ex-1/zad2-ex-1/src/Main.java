import static java.lang.System.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int[] array;

        System.out.print("Въведете дължина на масива: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        array = new int[n];
        System.out.println("Въведете елементите на масива: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "]: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Оригинален масив: ");
        printArray(array);
        System.out.println("Обърнат масив: ");
        printArray(reversedArray(array));


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
        System.out.println();
    }

}