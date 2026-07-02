package interview.basics;

import java.util.Scanner;

public class Fibonacci {

    public static void fibonacci(int n) {

        int f = 0;
        int s = 1;

        for (int i = 0; i < n; i++) {

            System.out.print(f + " ");
            int next = f + s;
            f = s;
            s = next;

        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Provide the number for fibonacci:-");

        int n = s.nextInt();

        fibonacci(n);

        s.close();

    }
}
