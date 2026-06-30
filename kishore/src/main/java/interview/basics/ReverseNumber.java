package interview.basics;

import java.util.Scanner;

public class ReverseNumber {
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

        System.out.println("Please enter a number: ");

        int a = sc.nextInt();

        int result = reverseNum(a);
        System.out.println(result + " is the reversed number of the input");

        sc.close();
    }
}
