import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double temperature;
        char unit, unit2 = 'F';
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете температура: ");
        temperature = scanner.nextFloat();
        System.out.print("Въведете мерна единица (C или F): ");
        unit = scanner.next().charAt(0);
        unit = Character.toUpperCase(unit);
        if(unit == 'F')
        {
            unit2 = 'C';
        }

        System.out.printf("%.2f %c = %.2f %c", temperature, unit, TempConverter(temperature, unit), unit2);
    }

    public static double TempConverter(double temp, char unit)
    {
        double result = 0;
        if(unit == 'C')
        {
            result = (double) 5/9 * (temp - 32);
        }
        else if(unit == 'F')
        {
            result = (temp * 9/5) + 32;
        }
        else
        {
            System.out.println("Невалидна мерна единица!");
        }
        return result;
    }
}