import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SeiveOfErathostheness {
    //Find all the Prime Numbers less than or equal to a given Number
    //Given a number n, print all primes smaller than or equal to n. It is also given that n is a small number.
    public static void main(String[] args) {
        int i = 10;
        findSieve(i);
    }

    public static void findSieve(int n) {
        if (n <= 1) {
            return;
        }
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i])
                System.out.print(i + " ");

        }
    }
}
