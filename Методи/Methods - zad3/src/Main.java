import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете дума или фраза: ");
        String text = scanner.nextLine();
        System.out.println(Palindrome(text));
    }

    public static String Palindrome(String str)
    {
        String reverse = "";
        str = str.toLowerCase();
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse += str.charAt(i);
        }

        if(str.equals(reverse))
        {
            return "Думата или фразата е палиндром";
        }
        else
        {
            return "Думата или фразата не е палиндром";
        }
    }
}