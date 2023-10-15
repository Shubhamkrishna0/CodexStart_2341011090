import java.util.Scanner;

public class Q7_1617 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int MOD = 1000000007;

        // Initialize an array to store the number of bit strings of length i
        long[] dp = new long[n + 1];

        // initial case
        dp[0] = 1;

        // Calculate the number of bit strings for each length from 1 to n
        for (int i = 1; i <= n; i++) {
            dp[i] = (dp[i - 1] * 2) % MOD;
        }

        // Print the result modulo 10^9 + 7
        System.out.println(dp[n]);
    }
}