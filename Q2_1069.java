//NAME:- SHUBHAM KRISHNA
//REGISTRATION NO. :- 2341011090
//Problem Statement Link :- https://cses.fi/problemset/task/1069

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Q2_1069 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Read input
        String input = reader.readLine();

        // Calculate the length of the longest term
        int Repetition = calculateLongestRepetition(input);

        System.out.println(Repetition);
    }

    private static int calculateLongestRepetition(String a) {
        int maximumLength = 1;
        int RealLength = 1;

        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == a.charAt(i - 1)) {
                RealLength++;
                maximumLength = Math.max(maximumLength, RealLength);
            } else {
                RealLength = 1;
            }
        }

        return maximumLength;
    }
}

