//NAME:- SHUBHAM KRISHNA

//REGISTRATION NO. :- 2341011090

//Problem Statement Link :- https://cses.fi/problemset/task/1072



import java.util.Scanner;

public class Q5_1072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        for (int k = 1; k <= n; k++) {
            long totalPositions = (long) k * k;
            long nonAttackingPositions = totalPositions * (totalPositions - 1) / 2 - 4 * (k - 1) * (k - 2);
            System.out.println(nonAttackingPositions);
        }
    }
}
