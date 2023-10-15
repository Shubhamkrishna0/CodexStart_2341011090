//NAME:- SHUBHAM KRISHNA

//REGISTRATION NO. :- 2341011090

//Problem Statement Link :- https://cses.fi/problemset/task/1070

import java.util.Scanner;

public class Q4_1070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n == 1) {
            System.out.println("1");
        } else if (n <= 3) {
            System.out.println("no solution");
        } else {
            StringBuilder result = new StringBuilder();

            for (int i = 2; i <= n; i += 2) {
                result.append(i).append(" ");
            }
            for (int i = 1; i <= n; i += 2) {
                result.append(i).append(" ");
            }
            System.out.println(result);
        }
    }
}
