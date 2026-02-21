import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int rev = 0, temp = n;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        if (temp == rev)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome Number");

        sc.close();
    }
}
