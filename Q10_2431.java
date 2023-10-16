//NAME:- SHUBHAM KRISHNA

//REGISTRATION NO. :- 2341011090

//Problem Statement Link :- https://cses.fi/problemset/task/2431/

import java.util.Scanner;

public class Q10_2431 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        long[] data = new long[p];

        for (int i = 0; i < p; i++) {
            data[i] = scanner.nextLong();
        }

        for (int i = 0; i < p; i++) {
            long k = data[i];
            long length = 1;
            long count = 9;

            while (k > length * count) {
                k -= length * count;
                length++;
                count *= 10;
            }

            // Calculate the number
            long num = (k - 1) / length + (long) Math.pow(10, length - 1);

            // Calculate the digit position in the number
            int digitPosition = (int) ((k - 1) % length);

            // Extract the digit from the number
            int digit = Long.toString(num).charAt(digitPosition) - '0';

            System.out.println(digit);
        }
    }
}
