import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operation;
        System.out.print("Въведете първо число: ");
        num1 = scanner.nextDouble();
        System.out.print("Въведете второ число: ");
        num2 = scanner.nextDouble();
        System.out.print("Въведете операция (+, -, *, /): ");
        operation = scanner.next().charAt(0);
        System.out.printf("%.2f %c %.2f = %.2f",num1, operation, num2, Calc(num1, num2, operation));
    }

    public static double Calc(double num1, double num2, char operation)
    {
        double result = 0;
        if(operation == '+')
        {
            result = num1 + num2;
        }
        else if(operation == '-')
        {
            result = num1 - num2;
        }
        else if(operation == '*')
        {
            result = num1 * num2;
        }
        else if(operation == '/')
        {
            result = num1 / num2;
        }
        else
        {
            System.out.println("Невалидна операция!");
        }
        return result;
    }
}