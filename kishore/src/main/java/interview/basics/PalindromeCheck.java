package interview.basics;

import java.util.Scanner;

public class PalindromeCheck {

    public static int reverseNum(int num) {
        int rev = 0;

        while (num > 0) {
            int dig = num % 10;
            rev = rev * 10 + dig;
            num = num / 10;
        }

        return rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is palindrome");

        int a = sc.nextInt();

        int result = reverseNum(a);

        if ( result == a) {
            System.out.println("The number " + a + " is a palindrome..!");
        }
        else {
            System.out.println("The number " + a + " is not a palindrome..!");
        }

        sc.close();
    }
}
