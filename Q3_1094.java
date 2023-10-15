//NAME:- SHUBHAM KRISHNA

//REGISTRATION NO. :- 2341011090

//Problem Statement Link :- https://cses.fi/problemset/task/1094/

import java.util.Scanner;

public class Q3_1094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        long moves = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] < array[i - 1]) {

                int diff = array[i - 1] - array[i];
                array[i] += diff;
                moves += diff;
            }
        }

        System.out.println(moves);
    }
}



