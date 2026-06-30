package interview.basics;

import java.util.Scanner;

public class SumOfDigit {
    public static int getSumOfDigit(int n) {

        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
         return sum;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to find its sum: ");

        int num = sc.nextInt();

        int result = getSumOfDigit(num);

        System.out.println(result + " is the sum of the given number");

        sc.close();

    }
}
