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
        System.out.println("Сумата на елементите на масива е " + arrSum(array));
        System.out.println("Сумата на четните елементи на масива е " + evenNumbersSum(array));
        System.out.println("Сумата на нечетните елементи на масива е " + oddNumbersSum(array));
        System.out.println("Сума: " + arrSum(array) + ", Четни: " + evenNumbersSum(array) + ", Нечетни: " + oddNumbersSum(array));
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
}