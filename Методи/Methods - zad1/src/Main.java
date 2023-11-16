import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sacnner = new Scanner(System.in);
        System.out.print("Въведете броя на стойностите: ");
        num = sacnner.nextInt();
        System.out.print("Средно аритметично: " + Average(num));
    }

    public static double Average(int n)
    {
        Scanner sacnner = new Scanner(System.in);

        int sum = 0;
        int[] arr = new int[n];
        double avg;
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("Въведете стойност #1: ");
            arr[i] = sacnner.nextInt();
            sum += arr[i];
        }
        avg = (double) sum / n;
        return avg;
    }
}