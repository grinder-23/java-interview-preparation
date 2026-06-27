package interview.basics;
import java.util.Scanner;


public class EvenOdd {

    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println( num + " is Even number");
        } else  {
            System.out.println( num + " is Odd number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check if it is even or odd :");

        int num = sc.nextInt();

        while (num < 0) {
            System.out.println("Enter a valid positive number");
            num = sc.nextInt();
        }

        checkEvenOdd(num);

        sc.close();
    }
}

