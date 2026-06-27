package interview.basics;

import java.util.Scanner;

public class MultiplicationT {
    public static void multiply(int a, int b) {
        for (int i=1; i<=b; i++) {
            System.out.println(a + " X " + i + " = " + a*i);
        }
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number for which u want tables: ");

        int x = sc.nextInt();

        System.out.println("How many times you want the tables to be printed: ");

        int y = sc.nextInt();

        multiply(x,y);

        sc.close();
    }
}
