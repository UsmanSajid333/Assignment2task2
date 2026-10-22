package Task2.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours (h): ");
        int h = input.nextInt();

        System.out.print("Enter minutes (m): ");
        int m = input.nextInt();

        System.out.print("Enter seconds (s): ");
        int s = input.nextInt();

        s++;

        if (s == 60) {
            s = 0;
            m++;
        }

        if (m == 60) {
            m = 0;
            h++;
        }

        if (h == 24) {
            h = 0;
        }

        System.out.println("Time one second later: " + h + " " + m + " " + s);
    }
}
