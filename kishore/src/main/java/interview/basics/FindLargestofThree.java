package interview.basics;

import java.util.Scanner;

public class FindLargestofThree {

    public static void getlargestofthree(int a, int b, int c) {
        int largest = a;

        if (b > a && b > c) {
            largest = b;
        }

        if (c > a && c > b) {
            largest = c;
        }

        System.out.println(largest + " is the largest among 3 numbers");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers to check");

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        getlargestofthree(x,y,z);
    }
}
