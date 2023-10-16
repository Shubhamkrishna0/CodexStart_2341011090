import java.util.Scanner;

public class Q8_1618 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        // Counting the number of trailing zeros in factorial n!
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }

        //result
        System.out.println(count);
    }
}
