//NAME:- SHUBHAM KRISHNA

//REGISTRATION NO. :- 2341011090

//Problem Statement Link :- https://cses.fi/problemset/task/1624


import java.util.Scanner;
public class Q6_1624 {
    static int count = 0;

    public static void main(String[] args) {
        char[][] board = new char[8][8];
        Scanner scanner = new Scanner(System.in);

        // Read input
        for (int i = 0; i < 8; i++) {
            board[i] = scanner.nextLine().toCharArray();
        }

        solve(board, 0);
        System.out.println(count);
    }

    static boolean isSafe(char[][] board, int row, int col) {
        // Check if there is a queen in the same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = row, j = col; i >= 0 && j < 8; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static void solve(char[][] board, int row) {
        if (row == 8) {
            count++;
            return;
        }

        for (int col = 0; col < 8; col++) {
            if (board[row][col] == '.' && isSafe(board, row, col)) {
                board[row][col] = 'Q';
                solve(board, row + 1);
                board[row][col] = '.'; // backtrack
            }
        }
    }
}

