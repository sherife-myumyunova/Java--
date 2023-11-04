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
        for(int i = 0; i < array.length; i++){
            System.out.print("array[" + i + "]: ");
            array[i] = scanner.nextInt();
        }
        MinAndMax(array);
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
        System.out.println("Макс: " + max + ", Мин: " + min);
    }

}