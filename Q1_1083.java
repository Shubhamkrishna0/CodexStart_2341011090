//NAME:- SHUBHAM KRISHNA
//REGISTRATION NO. :- 2341011090
//Problem Statement Link :- https://cses.fi/problemset/task/1083/

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Q1_1083 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Process the value
        int n = Integer.parseInt(reader.readLine());
        int xorAll = 1;

        // Evaluate XOR of all numbers from 1 to n
        for (int i = 2; i <= n; i++) {
            xorAll ^= i;
        }

        // Read (n-1) numbers and evaluate XOR of the given array


        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int xorArray = Integer.parseInt(tokenizer.nextToken());
        for (int i = 2; i <= n - 1; i++) {
            xorArray ^= Integer.parseInt(tokenizer.nextToken());
        }

        // Calculating the missing number
        int missingNumber = xorAll ^ xorArray;

        System.out.println(missingNumber);
    }
}
